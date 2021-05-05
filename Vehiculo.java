package pe.edu.upc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Vehiculo")
public class Vehiculo {

	@Id
	@Column(name = "idVehiculo", nullable = false, length = 6)
	private String idVehiculo;

	@Column(name = "marcaVehiculo", nullable = false, length = 40)
	private String marcaVehiculo;

	@Column(name = "modeloVehiculo", nullable = false, length = 40)
	private String modeloVehiculo;

	@Column(name = "ageVehiculo", nullable = false)
	private int ageVehiculo;

	@Column(name = "revisionVehiculo", nullable = false, length = 40)
	private String revisionVehiculo;

	@ManyToOne
	@JoinColumn(name = "idConductor", nullable = false)
	private Conductor conductor;

	public Vehiculo(String idVehiculo, String marcaVehiculo, String modeloVehiculo, int ageVehiculo,
			String revisionVehiculo, Conductor conductor) {
		super();
		this.idVehiculo = idVehiculo;
		this.marcaVehiculo = marcaVehiculo;
		this.modeloVehiculo = modeloVehiculo;
		this.ageVehiculo = ageVehiculo;
		this.revisionVehiculo = revisionVehiculo;
		this.conductor = conductor;
	}

	public Vehiculo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getIdVehiculo() {
		return idVehiculo;
	}

	public void setIdVehiculo(String idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public String getMarcaVehiculo() {
		return marcaVehiculo;
	}

	public void setMarcaVehiculo(String marcaVehiculo) {
		this.marcaVehiculo = marcaVehiculo;
	}

	public String getModeloVehiculo() {
		return modeloVehiculo;
	}

	public void setModeloVehiculo(String modeloVehiculo) {
		this.modeloVehiculo = modeloVehiculo;
	}

	public int getAgeVehiculo() {
		return ageVehiculo;
	}

	public void setAgeVehiculo(int ageVehiculo) {
		this.ageVehiculo = ageVehiculo;
	}

	public String getRevisionVehiculo() {
		return revisionVehiculo;
	}

	public void setRevisionVehiculo(String revisionVehiculo) {
		this.revisionVehiculo = revisionVehiculo;
	}

	public Conductor getConductor() {
		return conductor;
	}

	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}

}
