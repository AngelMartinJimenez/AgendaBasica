package datos;

import java.util.List;
import modelo.Persona;

public interface IPersona {
	
	public List<Persona> listarTabla();

	public Persona buscarPersona(int id);

	public List<Persona> buscarNombre(String nombre);
		
	public List<Persona> categoria();
	    
	public List<Persona> listarTabla(String group);

}
