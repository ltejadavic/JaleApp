package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.MedicCenter;
import pe.edu.upc.entity.Speciality;
import pe.edu.upc.service.IMedicCenterService;
import pe.edu.upc.service.ISpecialityService;

@Named
@RequestScoped
public class SpecialityController {

	// SERVICE
	@Inject
	private ISpecialityService sService;
	@Inject
	private IMedicCenterService mService;

	// Atributos
	private Speciality speciality;
	private MedicCenter medic;
	List<Speciality> listaEspecialidades;
	List<MedicCenter> listaCentrosMedicos;

	@PostConstruct
	public void init() {
		this.medic = new MedicCenter();
		this.speciality = new Speciality();
		this.listaCentrosMedicos = new ArrayList<MedicCenter>();
		this.listaEspecialidades = new ArrayList<Speciality>();
		this.listarCentroMedico();
		this.listarEspecialidad();
	}

	// Metodos

	public String nuevoEspecialidad() {

		this.setSpeciality(new Speciality());

		return "speciality.xhtml";

	}

	public void insert() {

		try {

			sService.insert(speciality);

		} catch (Exception e) {

			System.out.println("Error al insertar en el controller de especialidad");

		}

	}

	public void listarCentroMedico() {

		try {

			listaCentrosMedicos = mService.list();

		} catch (Exception e) {

			System.out.println("Error al listar en el controller de medic center");

		}

	}

	public void listarEspecialidad() {

		try {

			listaEspecialidades = sService.list();

		} catch (Exception e) {

			System.out.println("Error al listar en el controller de especialidad");

		}

	}

	public void eliminar(Speciality speciality) {

		try {

			sService.delete(speciality.getIdSpeciality());

			this.listarEspecialidad();

		} catch (Exception e) {

			System.out.println("Error al eliminar en el controller de especialidad");

		}

	}

	// get y set

	public Speciality getSpeciality() {
		return speciality;
	}

	public void setSpeciality(Speciality speciality) {
		this.speciality = speciality;
	}

	public MedicCenter getMedic() {
		return medic;
	}

	public void setMedic(MedicCenter medic) {
		this.medic = medic;
	}

	public List<Speciality> getListaEspecialidades() {
		return listaEspecialidades;
	}

	public void setListaEspecialidades(List<Speciality> listaEspecialidades) {
		this.listaEspecialidades = listaEspecialidades;
	}

	public List<MedicCenter> getListaCentrosMedicos() {
		return listaCentrosMedicos;
	}

	public void setListaCentrosMedicos(List<MedicCenter> listaCentrosMedicos) {
		this.listaCentrosMedicos = listaCentrosMedicos;
	}

}
