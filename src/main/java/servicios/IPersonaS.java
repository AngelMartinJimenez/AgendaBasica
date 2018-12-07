package servicios;

import java.util.List;
import modelo.Persona;

public interface IPersonaS {

	public List<Persona> listarTabla();
	
	public Persona buscarPersona(int id);
	
	public List<Persona> listarTabla(String group);
	
	public List<Persona> buscarNombre(String nombre);
	
	public List<Persona> categoria();
	
}