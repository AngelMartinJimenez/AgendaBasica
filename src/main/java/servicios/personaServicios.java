package servicios;

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

public class personaServicios implements IPersonaS {
	
	@Autowired
	
	private IPersona personaDAO;
	/**
	 * 
	@param: pasamos un objeto persona para añadirlo
	
	*/
	public void add(Persona persona) {
		
		new personaDAO().add(persona);
		
	}
	
	/*
	 * @param: pasamos el nombre de tipo string para borrar el usuario
	 */
	public void delete(String nombre) {
		
		new personaDAO().delete(nombre);
		
	}
	
	/*
	 * @param: pasamos el objeto persona para actualizarlo
	 */
	public void update (Persona persona) {
		
		new personaDAO().update(persona);
	}
	
	/*
	 * Realizamos metodo para listar personas
	 */
	public List<Persona> read(){
		
		return new personaDAO().listPerson();
	}
	
	
	

}
