package com.agenda.app.AgendaBasica.servicios;

import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

/**
 * 
 * @author María Victoria
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agenda.app.AgendaBasica.datos.IPersona;
import com.agenda.app.AgendaBasica.modelo.Persona;

@Service
@Transactional

public class PersonaServicios implements IPersonaS {
	
	@Autowired
	
	private IPersona PersonaDAO;
	/**
	 * Metodo para añadir una persona
	@param: pasamos un objeto persona para añadirlo
	
	*/
	public void add(Persona persona) {
		
		PersonaDAO.add(persona);
		
	}
	
	/*Metodo para añadir una persona
	 * @param: pasamos el nombre de tipo string para borrar el usuario
	 */
	public void delete(int id) {
		
		PersonaDAO.delete(id);
		
	}
	
	/*Metodo para añadir una persona
	 * @param: pasamos el objeto persona para actualizarlo
	 */
	public void update (Persona persona) {
		
		PersonaDAO.update(persona);
	}
	
	/**
	 * Metodo para añadir una persona
	 */
	public Persona read(int id){
		
		return PersonaDAO.read(id);
	}
	
	/**
	 * Metodo para solo actualizar el nombre de una persona
	 */
	@Override
	public void updateName(int id, String nombre) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Metodo para solo actualizar el apellido 1 de una persona
	 */
	@Override
	public void updateLastName1(int id, String apellido1) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Metodo para solo actualizar el apellido 2 de una persona
	 */
	@Override
	public void updateLastName2(int id, String apellido2) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Metodo para solo actualizar el dni de una persona
	 */
	@Override
	public void updateDNI(int id, String dni) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Metodo para solo actualizar la fecha de nacimiento de una persona
	 */
	@Override
	public void updateBirthDay(int id, LocalDate localDate) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Metodo para listar todas las personas
	 */
	@Override
	public List<Persona> listPersons() {
		// TODO Auto-generated method stub
		return PersonaDAO.listPersons();
	}

	



	
	
	
	

}
