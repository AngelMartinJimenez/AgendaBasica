package servicios;

import java.time.LocalDate;
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
	
	private IPersona PersonaDAO;
	/**
	 * 
	@param: pasamos un objeto persona para añadirlo
	
	*/
	public void add(Persona persona) {
		
		PersonaDAO.add(persona);
		
	}
	
	/*
	 * @param: pasamos el nombre de tipo string para borrar el usuario
	 */
	public void delete(int id) {
		
		PersonaDAO.delete(id);
		
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
	
	
	public Persona read(int id){
		
		return PersonaDAO.read(id);
	}

	@Override
	public void updateName(int id, String nombre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateLastName1(int id, String apellido1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateLastName2(int id, String apellido2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateDNI(int id, String dni) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBirthDay(int id, LocalDate localDate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Persona> listPersons() {
		// TODO Auto-generated method stub
		return PersonaDAO.listPersons();
	}

	



	
	
	
	

}
