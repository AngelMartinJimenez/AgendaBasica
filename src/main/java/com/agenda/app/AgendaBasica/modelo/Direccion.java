package com.agenda.app.AgendaBasica.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "direccion")
public class Direccion {
		
	@Id
	@GeneratedValue
	@Column(name = "iddireccion")
	private int iddireccion;
	private String direccion;
	private String codpostal;
	private String localidad;
	private int idprovincia;
	private int idpersona;
	/*
	 * Constructor vacio
	 */
	public Direccion() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*
	 * Constructor con parametros
	 */
	public Direccion(int iddireccion, String direccion, String codpostal, String localidad, int idprovincia,
			int idpersona) {
		super();
		this.iddireccion = iddireccion;
		this.direccion = direccion;
		this.codpostal = codpostal;
		this.localidad = localidad;
		this.idprovincia = idprovincia;
		this.idpersona = idpersona;
	}

	/*
	 *  Método de acceso al id de la direccion
	 *  @return devuelve el id de la direccion
	 */
	public int getIddireccion() {
		return iddireccion;
	}

	/*
	 * Método de acceso para modificar el id de la direccion
	 * @param dato por el que cambiaremos el id
	 */
	public void setIddireccion(int iddireccion) {
		this.iddireccion = iddireccion;
	}

	/*
	 *  Método de acceso a la direccion
	 *  @return devuelve la direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	
	/*
	 * Método de acceso para modificar la direccion
	 * @param dato por el que cambiaremos la direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/*
	 *  Método de acceso al codigo postal
	 *  @return devuelve el codigo postal
	 */
	public String getCodpostal() {
		return codpostal;
	}

	/*
	 * Método de acceso para modificar el codigo postal
	 * @param dato por el que cambiaremos el codigo postal
	 */
	public void setCodpostal(String codpostal) {
		this.codpostal = codpostal;
	}

	/*
	 *  Método de acceso a la localidad
	 *  @return devuelve la localidad
	 */
	public String getLocalidad() {
		return localidad;
	}

	/*
	 * Método de acceso para modificar la localidad
	 * @param dato por el que cambiaremos la localidad
	 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	/*
	 *  Método de acceso a la provincia
	 *  @return devuelve la provincia
	 */
	public int getIdprovincia() {
		return idprovincia;
	}

	/*
	 * Método de acceso para modificar el id de la provincia
	 * @param dato por el que cambiaremos el id de la provincia
	 */
	public void setIdprovincia(int idprovincia) {
		this.idprovincia = idprovincia;
	}

	/*
	 *  Método de acceso al id de la persona
	 *  @return devuelve el id de la persona
	 */
	public int getIdpersona() {
		return idpersona;
	}

	/*
	 * Método de acceso para modificar el id de la persona
	 * @param dato por el que cambiaremos el id de la persona
	 */
	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}

	/*
	 * Metodo To-String de la Clase Direccion
	 */
	@Override
	public String toString() {
		return "Direccion [iddireccion=" + iddireccion + ", direccion=" + direccion + ", codpostal=" + codpostal
				+ ", localidad=" + localidad + ", idprovincia=" + idprovincia + ", idpersona=" + idpersona + "]";
	}
	
}
