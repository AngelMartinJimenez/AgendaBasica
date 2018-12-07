package modelo;

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
@Table(name = "provincia")
public class Provincia {
	
	@Id
	@GeneratedValue
	@Column(name = "idprovincia")
	private int iddireccion;
	private String provincia;
	
	/*
	 * Constructor vacio
	 */
	public Provincia() {
		super();
		// TODO Auto-generated constructor stub
	}
	/*
	 * Constructor con parametros
	 */
	public Provincia(int iddireccion, String provincia) {
		super();
		this.iddireccion = iddireccion;
		this.provincia = provincia;
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
	 * @param dato por el que cambiaremos el id de la direccion
	 */
	public void setIddireccion(int iddireccion) {
		this.iddireccion = iddireccion;
	}
	
	/*
	 *  Método de acceso la provincia
	 *  @return devuelve la provincia
	 */
	public String getProvincia() {
		return provincia;
	}
	
	/*
	 * Método de acceso para modificar la provincia
	 * @param dato por el que cambiaremos la provincia
	 */
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	

	/*
	 * Metodo To-String de la clase Provincia
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Provincia [iddireccion=" + iddireccion + ", provincia=" + provincia + "]";
	}
	
	

	
	

}
