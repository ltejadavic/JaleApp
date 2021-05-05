package pe.edu.upc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EstadoViaje")
public class EstadoViaje {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEstadoViaje;

	@Column(name = "nameEstadoViaje", nullable = false, length = 40)
	private String nameEstadoViaje;

	// constructor with parameters
	public EstadoViaje() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Constructor without parameters
	public EstadoViaje(int idEstadoViaje, String nameEstadoViaje) {
		super();
		this.idEstadoViaje = idEstadoViaje;
		this.nameEstadoViaje = nameEstadoViaje;
	}

	// get and set of attributes
	public int getIdEstadoViaje() {
		return idEstadoViaje;
	}

	public void setIdEstadoViaje(int idEstadoViaje) {
		this.idEstadoViaje = idEstadoViaje;
	}

	public String getNameEstadoViaje() {
		return nameEstadoViaje;
	}

	public void setNameEstadoViaje(String nameEstadoViaje) {
		this.nameEstadoViaje = nameEstadoViaje;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idEstadoViaje;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EstadoViaje other = (EstadoViaje) obj;
		if (idEstadoViaje != other.idEstadoViaje)
			return false;
		return true;
	}

}
