package pe.edu.upc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Speciality")
public class Speciality {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSpeciality;

	@Column(name = "nameSpeciality", nullable = false, length = 37)
	private String nameSpeciality;

	@ManyToOne
	@JoinColumn(name = "idMedicCenter", nullable = false)
	private MedicCenter medicCenter;

	public Speciality(int idSpeciality, String nameSpeciality, MedicCenter medicCenter) {
		super();
		this.idSpeciality = idSpeciality;
		this.nameSpeciality = nameSpeciality;
		this.medicCenter = medicCenter;
	}

	public Speciality() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdSpeciality() {
		return idSpeciality;
	}

	public void setIdSpeciality(int idSpeciality) {
		this.idSpeciality = idSpeciality;
	}

	public String getNameSpeciality() {
		return nameSpeciality;
	}

	public void setNameSpeciality(String nameSpeciality) {
		this.nameSpeciality = nameSpeciality;
	}

	public MedicCenter getMedicCenter() {
		return medicCenter;
	}

	public void setMedicCenter(MedicCenter medicCenter) {
		this.medicCenter = medicCenter;
	}

}
