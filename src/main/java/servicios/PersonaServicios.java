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
	
	/*
	 * Llamamos a la parte de datos
	 */
	private IPersona PersonaDAO;
	/**
	 * 
	@param: pasamos un objeto persona para añadirlo
	
	*/
	/*
	 * No creamos el objeto porque ya lo hemos creado arriba
	 */
	public void add(Persona persona) {
		
		PersonaDAO.add(persona);
		
	}
	
	/*
	 * @param: pasamos el nombre de tipo string para borrar el usuario
	 */
	public void delete(String nombre) {
		
		PersonaDAO.delete(nombre);
		
	}
	
	/*
	 * @param: pasamos el objeto persona para actualizarlo
	 */
	public void update (Persona persona) {
		
		PersonaDAO.update(persona);
	}
	
	/*
	 * Realizamos metodo para listar personas
	 */
	public List<Persona> read(){
		
		return PersonaDAO.listPerson();
	}
	
	
	

}
