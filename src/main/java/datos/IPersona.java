package datos;

import java.time.LocalDate;
import java.util.List;
import modelo.Persona;

public interface IPersona {
	
	

	public Persona read (int id);
	
	public void add (String nombre);
	
	public void delete (String nombre);
	
	public void update (Persona persona);
	
	public void updateName (int id,String nombre);
	
	public void updateLastName1 (int id,String apellido1);
	
	public void updateLastName2 (int id,String apellido2);
	
	public void updateDNI (int id,String dni);
	
	public void updateBirthDay (int id,LocalDate localDate);
	
	public List<Persona> listPersons();
		
	

}
