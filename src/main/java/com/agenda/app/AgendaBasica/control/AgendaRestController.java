package com.agenda.app.AgendaBasica.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
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
	
	/**
	 * Metodo que añade una persona a la base de datos
	 * @param persona
	 * @return
	 */
	@PostMapping
	public Persona add(@RequestBody Persona persona) {
		
		
		return personaServicios.create(persona);
	}
	
	@DeleteMapping(path ={"/{id}"})
	public Persona deletePerson(@PathVariable("id") int id) {
		
		return personaServicios.deletePerson(id);
	}
	
	@PutMapping(path = {"/{id}"})
    public Persona update(@PathVariable("id") int id, @RequestBody Persona persona){
        persona.setIdpersona(id);
        return personaServicios.updatePerson(persona);
    }
	
	
	
	
}

