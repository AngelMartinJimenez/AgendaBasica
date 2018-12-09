package datos;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import modelo.Persona;

/**
 * 
 * @author Charo
 *
 */
@Repository
public class PersonaDAO implements IPersona {

	@PersistenceContext
	private EntityManager entityManager;
	/**
	 * Método para añadir una persona de la BBDD
	 */
	@Override
	public void add(Persona person) {

		entityManager.merge(person);

	}
	
	/**
	 * Método para borrar una persona de la BBDD
	 */
	public void delete(int id) {

		String hql = "DELETE Persona WHERE idpersona= '" + id + "'";

		entityManager.createQuery(hql);

	}
	
	
	/**
	 * Método para buscar una persona de la BBDD por su id
	 */
	public Persona read(int id) {

		//return entityManager.find(Persona.class, id);
		
		String hql = "FROM Persona WHERE idpersona="+id;
		return (Persona) entityManager.createQuery(hql).getResultList().get(0);
	}

	/**
	 * Método para actualizar la información de una persona en la BBDD
	 */
	@Override
	public void update(Persona persona) {

		Persona person = read(persona.getIdpersona());// Para encontrar la persona por el nombre

		person.setNombre(persona.getNombre());
		person.setApellido1(persona.getApellido1());
		person.setApellido2(persona.getApellido2());
		person.setDni(persona.getDni());
		person.setFechanacimiento(persona.getFechanacimiento());

		entityManager.flush();
	}
	
	/**
	 * Método para sólo actualizar el nombre de una persona en la BBDD
	 */
	@Override
	public void updateName(int id, String nombre) {

		Persona person = read(id);

		person.setNombre(nombre);

	}
	
	/**
	 * Método para sólo actualizar el primer apellido de una persona en la BBDD
	 */
	@Override
	public void updateLastName1(int id,String apellido1) {

		Persona person = read(id);

		person.setApellido1(apellido1);

	}
	
	/**
	 * Método para sólo actualizar el segundo apellido de una persona en la BBDD
	 */
	@Override
	public void updateLastName2(int id,String apellido2) {
		Persona person = read(id);

		person.setApellido2(apellido2);

	}
	
	
	/**
	 * Método para sólo actualizar el dni de una persona en la BBDD
	 */
	@Override
	public void updateDNI(int id,String dni) {
		Persona person = read(id);

		person.setDni(dni);

	}
	
	/**
	 * Método para sólo actualizar la fecha de nacimiento de una persona en la BBDD
	 */
	@Override
	public void updateBirthDay(int id,LocalDate localDate) {
		Persona person = read(id);

		person.setFechanacimiento(localDate);

	}
	
	/**
	 * Método para listar las personas existentes en la BBDD
	 */
	@Override
	@Transactional
	public List<Persona> listPersons() {
		
		String hql = "FROM Persona";
		return (List<Persona>) entityManager.createQuery(hql).getResultList();
	}

}
