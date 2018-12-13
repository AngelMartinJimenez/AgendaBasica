package com.agenda.app.AgendaBasica.datos;

import java.util.List;
import com.agenda.app.AgendaBasica.modelo.Persona;

/**
 * 
 * @author Charo
 *Interfaz de PersonaDAO
 */



public interface IPersona {
	
	
	/**
	 * Metodo leer usuario tanto en MVC como para REST
	 * @param id
	 * @return Persona
	 */
	public Persona read (int id);
	
	/**
	 * Metodo añadir persona
	 * @param person
	 */
	public void add (Persona person);
	
	/**
	 * Metodo borrar persona
	 * @param id
	 */
	public void delete (int id);
	
	/**
	 * Metodo para actualizar persona
	 * @param persona
	 */
	public void update (Persona persona);
	
	/**
	 * Metodo para actualizar solo el nombre de la persona
	 * @param id
	 * @param nombre
	 */
	public void updateName (int id,String nombre);
	
	/**
	 * Metodo para actualizar solo el primer apellido de la persona
	 * @param id
	 * @param apellido1
	 */
	public void updateLastName1 (int id,String apellido1);
	
	/**
	 * Metodo para actualizar solo el segundo apellido de la persona
	 * @param id
	 * @param apellido2
	 */
	public void updateLastName2 (int id,String apellido2);
	
	/**
	 * Metodo para actualizar solo el dni de la persona
	 * @param id
	 * @param dni
	 */
	public void updateDNI (int id,String dni);
	
	/**
	 * Metodo para actualizar solo la fecha de nacimiento de la persona
	 * @param id
	 * @param localDate
	 */
	//public void updateBirthDay (int id,LocalDate localDate);
	
	/**
	 * Metodo para listar todas las personas. Nos sirve tanto para MVC como para REST
	 * @return
	 */
	public List<Persona> listPersons();
	
	/**
	 * Metodo por el cual añadimos la persona en el servicio REST
	 * @param persona
	 * @return
	 */
		
	public Persona create(Persona persona);
	
	/**
	 * Metodo por el cual borramos la persona en el servicio REST
	 * @param id
	 * @return
	 */
	
	public Persona deletePerson(int id);
	
	/**
	 * Metodo por el cual actualizamos la persona en el servicio REST
	 * @param id
	 * @param persona
	 * @return
	 */
	
	public Persona updatePerson(int id, Persona persona);

}
