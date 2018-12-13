package com.agenda.app.AgendaBasica.datos;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.agenda.app.AgendaBasica.modelo.Persona;

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

		this.create(person);

	}
	
	/**
	 * Método para borrar una persona de la BBDD. Llama al metodo de más abajo, que es el que contiene el entity manager
	 */
	public void delete(int id) {

		/*Persona person = this.read(id);
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("---------" + person.toString() + "-------");
		System.out.println("-------------------------------------------------------------------------------");
		entityManager.remove(person);*/
		
		this.deletePerson(id);

	}
	
	
	/**
	 * Método para buscar una persona de la BBDD por su id
	 */
	public Persona read(int id) {

		return entityManager.find(Persona.class, id);
		
		//String hql = "FROM Persona WHERE idpersona="+id;
		//return (Persona) entityManager.createQuery(hql).getResultList().get(0);
	}

	/**
	 * Método para actualizar la información de una persona en la BBDD
	 */
	
	public void update(Persona persona) {

		/*Persona person = read(persona.getIdpersona());// Para encontrar la persona por el id

		persona.setNombre(persona.getNombre());
		persona.setApellido1(persona.getApellido1());
		persona.setApellido2(persona.getApellido2());
		persona.setDni(persona.getDni());
		persona.setFechanacimiento(persona.getFechanacimiento());
		
		entityManager.flush();*/
		
		//this.updatePerson(persona);
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
	//@Override
	/*public void updateBirthDay(int id,Date date) {
		Persona person = read(id);

		person.setFechanacimiento(date);

	}*/
	
	/**
	 * Método para listar las personas existentes en la BBDD
	 */
	@Override
	@Transactional
	public List<Persona> listPersons() {
		
		String hql = "FROM Persona";
		List<Persona>  lista= entityManager.createQuery(hql).getResultList();
		return lista;
	}
	
	/**
	 * Creamos este método como intermediario para que nos devuelve un objeto de tipo persona y poder usarlo en servicio REST
	 * @param id. Le pasamos el objeto persona para añadir al usuario
	 * @return devuelve el create de person
	 */
	
	@Override
	public Persona create(Persona persona) {
		
		return entityManager.merge(persona);
	}
	
	/**
	 * Creamos este método como intermediario para que nos devuelve un objeto de tipo persona y poder usarlo en servicio REST
	 * @param id. Le pasamos el parametro Id para borrar al usuario
	 * @return devuelve el remove de person
	 */
	
	public Persona deletePerson(int id) {
		
		Persona person = this.read(id);
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("---------" + person.toString() + "-------");
		System.out.println("-------------------------------------------------------------------------------");
		entityManager.remove(person);
		return person;
		
	}
	
	/**
	 * Metodo para actualizar contacto en metodo REST
	 * @param id y persona
	 */
	
	public Persona updatePerson(int id, Persona persona) {

		Persona person = read(id);// Para encontrar la persona por el id

		persona.setNombre(persona.getNombre());
		persona.setApellido1(persona.getApellido1());
		persona.setApellido2(persona.getApellido2());
		persona.setDni(persona.getDni());
		persona.setFechanacimiento(persona.getFechanacimiento());
		
		entityManager.merge(persona);
		return persona;
	}

}
