package com.agenda.app.AgendaBasica.control;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agenda.app.AgendaBasica.modelo.Persona;
import com.agenda.app.AgendaBasica.servicios.IPersonaS;





/**
 * 
 * @author Charo
 * Controlador Rest
 *
 */
@CrossOrigin (origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/contactos"})
public class AgendaRestController {
	

	
	
	@Autowired
	private IPersonaS personaServicios;
	
	private static final Logger logger = LoggerFactory.getLogger(AgendaRestController.class);
	
	/**
	 * Metodo que añade una persona a la base de datos
	 * @param persona
	 * @return
	 */
	@PostMapping
	public Persona add(@RequestBody Persona persona) {
		
		
		return personaServicios.create(persona);
	}
	
	/**
	 * Pasamos el id de la persona que queremos eliminar y llamamos al metodo de delete
	 * @param id
	 * @return
	 */
	
	@DeleteMapping(path ={"/{id}"})
	public Persona deletePerson(@PathVariable("id") int id) {
		
		return personaServicios.deletePerson(id);
	}
	
	/**
	 * Pasamos el id y el objeto persona y llamamos al metodo de actualizar para actualizar los datos de esa persona
	 * @param id
	 * @param persona
	 * @return
	 */
	
	@PutMapping(path = {"/{id}"})
    public Persona update(@PathVariable("id") int id, @RequestBody Persona persona){
        //persona.setIdpersona(id);
		logger.info("En Update");
        return personaServicios.updatePerson(id,persona);
    }
	
	/**
	 * Pasamos el id de la persona de la cual queremos hacer la consulta
	 * @param id
	 * @return
	 */
	
	@GetMapping(path = {"/{id}"})
    public Persona readPerson(@PathVariable("id") int id){
        return personaServicios.read(id);
    }
	
	/**
	 * Llamamos al metodo que nos va a proporcionar las lista de contactos general
	 * @return
	 */
	
	@GetMapping
    public List<Persona> findAll(){
        return personaServicios.listPersons();
    }
	
	
	
	
}

