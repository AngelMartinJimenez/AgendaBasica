package com.agenda.app.AgendaBasica.servicios;

import java.time.LocalDate;
import java.util.List;
import com.agenda.app.AgendaBasica.modelo.Persona;

public interface IPersonaS {
	
	public Persona read (int id);
	
	public void add (Persona person);
	
	public void delete (int id);
	
	public void update (Persona persona);
	
	public void updateName (int id,String nombre);
	
	public void updateLastName1 (int id,String apellido1);
	
	public void updateLastName2 (int id,String apellido2);
	
	public void updateDNI (int id,String dni);
	
	public void updateBirthDay (int id,LocalDate localDate);
	
	public List<Persona> listPersons();
	
}