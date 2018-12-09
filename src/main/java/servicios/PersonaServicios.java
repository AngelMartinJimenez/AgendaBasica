package servicios;

import java.util.List;

import javax.transaction.Transactional;

/**
 * 
 * @author María Victoria
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import datos.IPersona;
import modelo.Persona;

@Service
@Transactional

public class PersonaServicios implements IPersonaS {
	
	@Autowired
	
	private IPersonaS PersonaServicios;
	/**
	 * 
	@param: pasamos un objeto persona para añadirlo
	
	*/
	public void add(Persona persona) {
		
		new PersonaServicios().add(persona);
		
	}
	
	/*
	 * @param: pasamos el nombre de tipo string para borrar el usuario
	 */
	public void delete(String nombre) {
		
		new PersonaServicios().delete(nombre);
		
	}
	
	/*
	 * @param: pasamos el objeto persona para actualizarlo
	 */
	public void update (Persona persona) {
		
		new PersonaServicios().update(persona);
	}
	
	/*
	 * Realizamos metodo para listar personas
	 */
	public List<Persona> read(){
		
		return new PersonaServicios().listPerson();
	}
	
	
	

}
