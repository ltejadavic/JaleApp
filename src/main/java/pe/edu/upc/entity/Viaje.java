package pe.edu.upc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Viaje")
public class Viaje {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idViaje;

	@ManyToOne
	@JoinColumn(name = "idEstadoViaje", nullable = false)
	private EstadoViaje estado;

	// constructor with parameters
	public Viaje() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Constructor without parameters
	public Viaje(int idViaje, EstadoViaje estado) {
		super();
		this.idViaje = idViaje;
		this.estado = estado;
	}

	// get and set of attributes

	public int getIdViaje() {
		return idViaje;
	}

	public void setIdViaje(int idViaje) {
		this.idViaje = idViaje;
	}

	public EstadoViaje getEstado() {
		return estado;
	}

	public void setEstado(EstadoViaje estado) {
		this.estado = estado;
	}

}
