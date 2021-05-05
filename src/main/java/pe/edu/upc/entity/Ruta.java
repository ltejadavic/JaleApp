package pe.edu.upc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Ruta")
public class Ruta {

	@Id
	@Column(name = "idRuta", nullable = false, length = 10)
	private String idRuta;

	@Column(name = "initRuta", nullable = false, length = 40)
	private String initRuta;

	@Column(name = "endRuta", nullable = false, length = 40)
	private String endRuta;

	@Column(name = "distRuta", nullable = false)
	private int distRuta;

	@Column(name = "timeRuta", nullable = false)
	private int timeRuta;

	@Column(name = "costRuta", nullable = false)
	private int costRuta;

	@ManyToOne
	@JoinColumn(name = "idPasajero", nullable = false)
	private Pasajero pasajero;

	public Ruta(String idRuta, String initRuta, String endRuta, int distRuta, int timeRuta, int costRuta,
			Pasajero pasajero) {
		super();
		this.idRuta = idRuta;
		this.initRuta = initRuta;
		this.endRuta = endRuta;
		this.distRuta = distRuta;
		this.timeRuta = timeRuta;
		this.costRuta = costRuta;
		this.pasajero = pasajero;
	}

	public Ruta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getIdRuta() {
		return idRuta;
	}

	public void setIdRuta(String idRuta) {
		this.idRuta = idRuta;
	}

	public String getInitRuta() {
		return initRuta;
	}

	public void setInitRuta(String initRuta) {
		this.initRuta = initRuta;
	}

	public String getEndRuta() {
		return endRuta;
	}

	public void setEndRuta(String endRuta) {
		this.endRuta = endRuta;
	}

	public int getDistRuta() {
		return distRuta;
	}

	public void setDistRuta(int distRuta) {
		this.distRuta = distRuta;
	}

	public int getTimeRuta() {
		return timeRuta;
	}

	public void setTimeRuta(int timeRuta) {
		this.timeRuta = timeRuta;
	}

	public int getCostRuta() {
		return costRuta;
	}

	public void setCostRuta(int costRuta) {
		this.costRuta = costRuta;
	}

	public Pasajero getPasajero() {
		return pasajero;
	}

	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idRuta == null) ? 0 : idRuta.hashCode());
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
		Ruta other = (Ruta) obj;
		if (idRuta == null) {
			if (other.idRuta != null)
				return false;
		} else if (!idRuta.equals(other.idRuta))
			return false;
		return true;
	}

}
