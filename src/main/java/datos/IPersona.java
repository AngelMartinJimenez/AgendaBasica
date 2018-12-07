package datos;

import java.util.List;
import modelo.Persona;

public interface IPersona {
	
	public List<Persona> listarTabla();

	public Persona read (int id);
	
	public Persona add (String nombre);
	
	public Persona delete (String nombre);
	
	public Persona update (Persona persona);

	public List<Persona> buscarNombre(String nombre);
		
	public List<Persona> categoria();
	    
	public List<Persona> listarTabla(String group);

}
