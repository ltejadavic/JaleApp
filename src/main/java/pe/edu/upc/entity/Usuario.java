package pe.edu.upc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario")
public class Usuario {
	@Id
	private int dniUser;
	@Column(name = "nameUser", nullable = false, length = 40)
	private String nameUser;
	@Column(name = "addressUser", nullable = false, length = 100)
	private String addressUser;
	@Column(name = "emailUser", nullable = false, length = 40)
	private String emailUser;
	@Column(name = "tiuUser", nullable = false, length = 40)
	private String tiuUser;

	// constructor with parameters
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Constructor without parameters

	public Usuario(int dniUser, String nameUser, String addressUser, String emailUser, String tiuUser) {
		super();
		this.dniUser = dniUser;
		this.nameUser = nameUser;
		this.addressUser = addressUser;
		this.emailUser = emailUser;
		this.tiuUser = tiuUser;
	}

	// get and set of attributes

	public int getDniUser() {
		return dniUser;
	}

	public void setDniUser(int dniUser) {
		this.dniUser = dniUser;
	}

	public String getNameUser() {
		return nameUser;
	}

	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}

	public String getAddressUser() {
		return addressUser;
	}

	public void setAddressUser(String addressUser) {
		this.addressUser = addressUser;
	}

	public String getEmailUser() {
		return emailUser;
	}

	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}

	public String getTiuUser() {
		return tiuUser;
	}

	public void setTiuUser(String tiuUser) {
		this.tiuUser = tiuUser;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dniUser;
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
		Usuario other = (Usuario) obj;
		if (dniUser != other.dniUser)
			return false;
		return true;
	}


}
