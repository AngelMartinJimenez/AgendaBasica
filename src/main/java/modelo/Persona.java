package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;




/**
 * 
 * @author Charo
 * 
 * Clase Persona, es la entidad de la tabla persona.
 *
 */
@Entity
@Table(name = "persona")
public class Persona {

	/**
	 * Atributos de la clase.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idpersona;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;
	@DateTimeFormat(pattern = "yyyy.MM.dd")
	private LocalDate fechanacimiento;
	
	@OneToMany( cascade = CascadeType.ALL, orphanRemoval = true)
	    private List<Direccion> listDirecciones = new ArrayList<>();
	
	@OneToMany( cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Telefono> listTelefonos = new ArrayList<>();
	
	/**
	 * Contructor vacío
	 */
	public Persona() {
		super();
	}

	/**
	 * Constructor
	 * @param idpersona
	 * @param nombre
	 * @param apellido1
	 * @param apellido2
	 * @param dni
	 * @param fechanacimiento
	 * @param direcciones
	 * @param telefonos
	 */
	public Persona(int idpersona, String nombre, String apellido1, String apellido2, String dni,
			LocalDate fechanacimiento/*, List<Direccion> direcciones, List<Telefono> telefonos*/) {
		super();
		this.idpersona = idpersona;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.fechanacimiento = fechanacimiento;
		//this.direcciones = direcciones;
		//this.telefonos = telefonos;
	}


	/**
	 * Método de acceso a la id de persona
	 * @return
	 */
	public int getIdpersona() {
		return idpersona;
	}

	/**
	 * Método de acceso para modificar la id de persona
	 * @param idpersona
	 */
	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}

	/**
	 * Método de acceso al nombre
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método de acceso para modificar el nombre
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método de acceso al primer apellido
	 * @return
	 */
	public String getApellido1() {
		return apellido1;
	}

	/**
	 * Método de acceso para modificar el primer apellido
	 * @param apellido1
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	/**
	 * Método de acceso al segundo apellido
	 * @return
	 */
	public String getApellido2() {
		return apellido2;
	}

	/**
	 * Método de acceso para modificar el segundo apellido
	 * @param apellido2
	 */
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	/**
	 * Método de acceso al dni
	 * @return
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Método de acceso para modificar el dni
	 * @param dni
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * Método de acceso a la fecha de nacimiento
	 * @return
	 */
	public LocalDate getFechanacimiento() {
		return fechanacimiento;
	}

	/**
	 * Método de acceso para modificar la fecha de nacimiento
	 * @param fechanacimiento
	 */
	public void setFechanacimiento(LocalDate fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	
	/**
	 * ToString de la clase Persona
	 */
	@Override
	public String toString() {
		return "Persona [idpersona=" + idpersona + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2="
				+ apellido2 + ", dni=" + dni + ", fechanacimiento=" + fechanacimiento + "]";
	}
	
	
	
	
	
	

}
