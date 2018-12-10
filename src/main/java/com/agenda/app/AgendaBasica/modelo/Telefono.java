package com.agenda.app.AgendaBasica.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * @autor: Angel Martin
 * @version: 07/12/2018
 */

@Entity
@Table(name = "telefono")
public class Telefono {
		
	@Id
	@GeneratedValue
	@Column(name = "idtelefono")
	private int idtelefono;
	private String telefono;
	private String idpersona;
	/*
	 * Constructor vacio
	 */
	public Telefono() {
		super();
		// TODO Auto-generated constructor stub
	}
	/*
	 * Constructor con parametros por atributo
	 */
	public Telefono(int idtelefono, String telefono, String idpersona) {
		super();
		this.idtelefono = idtelefono;
		this.telefono = telefono;
		this.idpersona = idpersona;
	}

	/*
	 *  Método de acceso a la id del telefono
	 *  @return devuelve el id del telefono
	 */
	public int getIdtelefono() {
		return idtelefono;
	}
	
	/*
	 * Método de acceso para modificar la id del telefono
	 * @param dato por el que cambiaremos el id
	 */
	public void setIdtelefono(int idtelefono) {
		this.idtelefono = idtelefono;
	}
	
	/*
	 *  Método de acceso al numero del telefono
	 *  @return devuelve el numero de telefono
	 */
	public String getTelefono() {
		return telefono;
	}
	
	/*
	 * Método de acceso para modificar el numero de telefono
	 * @param dato por el que cambiaremos el numero de telefono
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	/*
	 *  Método de acceso a la id de la persona
	 *  @return devuelve el id de la persona
	 */
	public String getIdpersona() {
		return idpersona;
	}
	
	/*
	 * Método de acceso para modificar la id de la persona
	 * @param dato por el que cambiaremos el id de la persona
	 */
	public void setIdpersona(String idpersona) {
		this.idpersona = idpersona;
	}
	
	/*
	 * ToString de la clase Telefono
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Telefono [idtelefono=" + idtelefono + ", telefono=" + telefono + ", idpersona=" + idpersona + "]";
	}
	
	
	
}
