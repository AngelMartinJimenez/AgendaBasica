package com.agenda.app.AgendaBasica.servicios;

import java.time.LocalDate;
import java.util.List;
import com.agenda.app.AgendaBasica.modelo.Persona;

/**
 * 
 * @author Charo
 *Interfaz de Persona Servicios
 */
public interface IPersonaS {
	
	/**
	 * Metodo para leer la persona
	 * @param id
	 * @return
	 */
	public Persona read (int id);
	
	/**
	 * Metodo para añadir la persona
	 * @param person
	 */
	public void add (Persona person);
	
	/**
	 * Metodo para borrar la persona
	 * @param id
	 */
	public void delete (int id);
	
	/**
	 * Metodo para actualizar la persona
	 * @param persona
	 */
	public void update (Persona persona);
	
	/**
	 * Metodo para solo actualizar el nombre de la persona
	 * @param id
	 * @param nombre
	 */
	public void updateName (int id,String nombre);
	
	/**
	 * Metodo para solo actualizar el apellido 1 de la persona
	 * @param id
	 * @param apellido1
	 */
	public void updateLastName1 (int id,String apellido1);
	
	/**
	 * Metodo para solo actualizar el apellido 2 de la persona
	 * @param id
	 * @param apellido2
	 */
	public void updateLastName2 (int id,String apellido2);
	
	/**
	 * Metodo para solo actualizar el dni de la persona
	 * @param id
	 * @param dni
	 */
	public void updateDNI (int id,String dni);
	
	/**
	 * Metodo para solo actualizar la fecha de nacimiento de la persona
	 * @param id
	 * @param localDate
	 */
	public void updateBirthDay (int id,LocalDate localDate);
	
	/**
	 * Metodo para listar todas las personas
	 * @return
	 */
	public List<Persona> listPersons();
	
	public Persona create(Persona persona);
	
	public Persona deletePerson(int id);
	
}