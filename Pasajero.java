package pe.edu.upc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Pasajero")
public class Pasajero {
	@Id
	@Column(name = "dniPasajero", nullable = false, length = 8)
	private String dniPasajero;
	@Column(name = "namePasajero", nullable = false, length = 40)
	private String namePasajero;

	@Column(name = "addressPasajero", nullable = false, length = 100)
	private String addressPasajero;

	@Column(name = "emailPasajero", nullable = false, length = 40)
	private String emailPasajero;

	@Column(name = "tiuPasajero", nullable = false, length = 40)
	private String tiuPasajero;

	@Column(name = "cuentaPasajero", nullable = false)
	private int cuentaPasajero;

	@Column(name = "saldoFavorPasajero", nullable = false)
	private int saldoFavorPasajero;

	@Column(name = "saldoAdeudadoPasajero", nullable = false)
	private int saldoAdeudadoPasajero;

	public Pasajero(String dniPasajero, String namePasajero, String addressPasajero, String emailPasajero,
			String tiuPasajero, int cuentaPasajero, int saldoFavorPasajero, int saldoAdeudadoPasajero) {
		super();
		this.dniPasajero = dniPasajero;
		this.namePasajero = namePasajero;
		this.addressPasajero = addressPasajero;
		this.emailPasajero = emailPasajero;
		this.tiuPasajero = tiuPasajero;
		this.cuentaPasajero = cuentaPasajero;
		this.saldoFavorPasajero = saldoFavorPasajero;
		this.saldoAdeudadoPasajero = saldoAdeudadoPasajero;
	}

	public Pasajero() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getDniPasajero() {
		return dniPasajero;
	}

	public void setDniPasajero(String dniPasajero) {
		this.dniPasajero = dniPasajero;
	}

	public String getNamePasajero() {
		return namePasajero;
	}

	public void setNamePasajero(String namePasajero) {
		this.namePasajero = namePasajero;
	}

	public String getAddressPasajero() {
		return addressPasajero;
	}

	public void setAddressPasajero(String addressPasajero) {
		this.addressPasajero = addressPasajero;
	}

	public String getEmailPasajero() {
		return emailPasajero;
	}

	public void setEmailPasajero(String emailPasajero) {
		this.emailPasajero = emailPasajero;
	}

	public String getTiuPasajero() {
		return tiuPasajero;
	}

	public void setTiuPasajero(String tiuPasajero) {
		this.tiuPasajero = tiuPasajero;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dniPasajero == null) ? 0 : dniPasajero.hashCode());
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
		Pasajero other = (Pasajero) obj;
		if (dniPasajero == null) {
			if (other.dniPasajero != null)
				return false;
		} else if (!dniPasajero.equals(other.dniPasajero))
			return false;
		return true;
	}

}