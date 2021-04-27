package pe.edu.upc.entity;

import java.util.Date;

public class MedicCenter {

	private int idMedicCenter;
	private String nameMedicCenter;
	private String adressMedicCenter;
	private String tiuMedicCenter;
	private String emailMedicCenter;

	// constructor sin param
	public MedicCenter() {
		super();
		// TODO Auto-generated constructor stub
	}

	// constructor con param

	public MedicCenter(int idMedicCenter, String nameMedicCenter, String adressMedicCenter, String emailMedicCenter, String tiuMedicCenter) {
		super();
		this.idMedicCenter = idMedicCenter;
		this.nameMedicCenter = nameMedicCenter;
		this.adressMedicCenter = adressMedicCenter;
		this.emailMedicCenter = emailMedicCenter;
		this.tiuMedicCenter = tiuMedicCenter;
		
	}

	// get y set
	public int getIdMedicCenter() {
		return idMedicCenter;
	}

	public void setIdMedicCenter(int idMedicCenter) {
		this.idMedicCenter = idMedicCenter;
	}

	public String getNameMedicCenter() {
		return nameMedicCenter;
	}

	public void setNameMedicCenter(String nameMedicCenter) {
		this.nameMedicCenter = nameMedicCenter;
	}

	public String getAdressMedicCenter() {
		return adressMedicCenter;
	}

	public void setAdressMedicCenter(String adressMedicCenter) {
		this.adressMedicCenter = adressMedicCenter;
	}

	public String getEmailMedicCenter() {
		return emailMedicCenter;
	}

	public void setEmailMedicCenter(String emailMedicCenter) {
		this.emailMedicCenter = emailMedicCenter;
	}
	
	public String getTiuMedicCenter() {
		return tiuMedicCenter;
	}

	public void setTiuMedicCenter(String tiuMedicCenter) {
		this.tiuMedicCenter = tiuMedicCenter;
	}

}
