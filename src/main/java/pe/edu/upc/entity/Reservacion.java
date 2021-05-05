package pe.edu.upc.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Reservacion")
public class Reservacion {

	@Id
	@Column(name = "idReservacion", nullable = false, length = 10)
	private String idReservacion;

	@ManyToOne
	@JoinColumn(name = "idRuta", nullable = false)
	private Ruta ruta;

	@ManyToOne
	@JoinColumn(name = "dniConductor", nullable = false)
	private Conductor conductor;

	private Date dateReservacion;

	public Reservacion(String idReservacion, Ruta ruta, Conductor conductor, Date dateReservacion) {
		super();
		this.idReservacion = idReservacion;
		this.ruta = ruta;
		this.conductor = conductor;
		this.dateReservacion = dateReservacion;
	}

	public Reservacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getIdReservacion() {
		return idReservacion;
	}

	public void setIdReservacion(String idReservacion) {
		this.idReservacion = idReservacion;
	}

	public Ruta getRuta() {
		return ruta;
	}

	public void setRuta(Ruta ruta) {
		this.ruta = ruta;
	}

	public Conductor getConductor() {
		return conductor;
	}

	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}

	public Date getDateReservacion() {
		return dateReservacion;
	}

	public void setDateReservacion(Date dateReservacion) {
		this.dateReservacion = dateReservacion;
	}

}
