package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Conductor;
import pe.edu.upc.service.IConductorService;

@Named
@RequestScoped
public class ConductorController {
	@Inject
	private IConductorService cService;

	private Conductor conductor;
	List<Conductor> listaConductores;

	@PostConstruct
	public void init() {

		this.conductor = new Conductor();
		this.listaConductores = new ArrayList<Conductor>();
		this.listarConductor();

	}

	// metodos
	public String nuevoConductor() {
		this.setConductor(new Conductor());
		return "conductor.xhtml";
	}

	public void insert() {

		try {
			cService.insert(conductor);

		} catch (Exception e) {
			System.out.println("Error al insertar en el controller de conductor");
		}

	}

	public void listarConductor() {
		try {
			listaConductores = cService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de conductor");
		}

	}

	public void eliminar(Conductor conductor) {
		try {
			cService.delete(conductor.getDniConductor());
			this.listarConductor();

		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de conductor");
		}

	}

	public void findbyName() {
		try {
			if (conductor.getNameConductor().isEmpty()) {
				this.listarConductor();
			} else {
				listaConductores = this.cService.findByNameConductor(this.getConductor());
			}
		} catch (Exception e) {
			System.out.println("Error al buscar controller en Conductor");
		}

	}

	public void clean() {

		this.init();

	}

	public Conductor getConductor() {
		return conductor;
	}

	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}

	public List<Conductor> getListaConductores() {
		return listaConductores;
	}

	public void setListaConductores(List<Conductor> listaConductores) {
		this.listaConductores = listaConductores;
	}

}
