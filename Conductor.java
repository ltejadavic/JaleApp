package pe.edu.upc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Conductor")
public class Conductor {

	@Id
	@Column(name = "dniConductor", nullable = false, length = 8)
	private String dniConductor;
	@Column(name = "nameConductor", nullable = false, length = 40)
	private String nameConductor;

	@Column(name = "addressConductor", nullable = false, length = 100)
	private String addressConductor;

	@Column(name = "emailConductor", nullable = false, length = 40)
	private String emailConductor;

	@Column(name = "tiuConductor", nullable = false, length = 40)
	private String tiuConductor;

	@Column(name = "descripcionConductor", nullable = false, length = 200)
	private String descripcionConductor;

	@Column(name = "cuentaConductor", nullable = false)
	private int cuentaConductor;

	@Column(name = "saldoConductor", nullable = false)
	private int saldoConductor;

	public Conductor(String dniConductor, String nameConductor, String addressConductor, String emailConductor,
			String tiuConductor, String descripcionConductor, int cuentaConductor, int saldoConductor) {
		super();
		this.dniConductor = dniConductor;
		this.nameConductor = nameConductor;
		this.addressConductor = addressConductor;
		this.emailConductor = emailConductor;
		this.tiuConductor = tiuConductor;
		this.descripcionConductor = descripcionConductor;
		this.cuentaConductor = cuentaConductor;
		this.saldoConductor = saldoConductor;
	}

	public Conductor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDniConductor() {
		return dniConductor;
	}

	public void setDniConductor(String dniConductor) {
		this.dniConductor = dniConductor;
	}

	public String getNameConductor() {
		return nameConductor;
	}

	public void setNameConductor(String nameConductor) {
		this.nameConductor = nameConductor;
	}

	public String getAddressConductor() {
		return addressConductor;
	}

	public void setAddressConductor(String addressConductor) {
		this.addressConductor = addressConductor;
	}

	public String getEmailConductor() {
		return emailConductor;
	}

	public void setEmailConductor(String emailConductor) {
		this.emailConductor = emailConductor;
	}

	public String getTiuConductor() {
		return tiuConductor;
	}

	public void setTiuConductor(String tiuConductor) {
		this.tiuConductor = tiuConductor;
	}

	public String getDescripcionConductor() {
		return descripcionConductor;
	}

	public void setDescripcionConductor(String descripcionConductor) {
		this.descripcionConductor = descripcionConductor;
	}

	public int getCuentaConductor() {
		return cuentaConductor;
	}

	public void setCuentaConductor(int cuentaConductor) {
		this.cuentaConductor = cuentaConductor;
	}

	public int getSaldoConductor() {
		return saldoConductor;
	}

	public void setSaldoConductor(int saldoConductor) {
		this.saldoConductor = saldoConductor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dniConductor == null) ? 0 : dniConductor.hashCode());
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
		Conductor other = (Conductor) obj;
		if (dniConductor == null) {
			if (other.dniConductor != null)
				return false;
		} else if (!dniConductor.equals(other.dniConductor))
			return false;
		return true;
	}

}
