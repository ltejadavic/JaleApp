package pe.edu.upc.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Pasajero")
public class Pasajero {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPasajero;

	@Column(name = "cuentaPasajero", nullable = false)
	private int cuentaPasajero;

	@Column(name = "saldoFavorPasajero", nullable = false)
	private int saldoFavorPasajero;

	@Column(name = "saldoAdeudadoPasajero", nullable = false)
	private int saldoAdeudadoPasajero;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "dniUser", nullable = false)
	private Usuario usuario;


	public Pasajero(int idPasajero, int cuentaPasajero, int saldoFavorPasajero, int saldoAdeudadoPasajero,
			Usuario usuario) {
		super();
		this.idPasajero = idPasajero;
		this.cuentaPasajero = cuentaPasajero;
		this.saldoFavorPasajero = saldoFavorPasajero;
		this.saldoAdeudadoPasajero = saldoAdeudadoPasajero;
		this.usuario = usuario;
	}

	public Pasajero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdPasajero() {
		return idPasajero;
	}

	public void setIdPasajero(int idPasajero) {
		this.idPasajero = idPasajero;
	}

	public int getCuentaPasajero() {
		return cuentaPasajero;
	}

	public void setCuentaPasajero(int cuentaPasajero) {
		this.cuentaPasajero = cuentaPasajero;
	}

	public int getSaldoFavorPasajero() {
		return saldoFavorPasajero;
	}

	public void setSaldoFavorPasajero(int saldoFavorPasajero) {
		this.saldoFavorPasajero = saldoFavorPasajero;
	}

	public int getSaldoAdeudadoPasajero() {
		return saldoAdeudadoPasajero;
	}

	public void setSaldoAdeudadoPasajero(int saldoAdeudadoPasajero) {
		this.saldoAdeudadoPasajero = saldoAdeudadoPasajero;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	

}
