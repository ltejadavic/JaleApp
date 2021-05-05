package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Conductor;
import pe.edu.upc.entity.Vehiculo;
import pe.edu.upc.service.IConductorService;
import pe.edu.upc.service.IVehiculoService;

@Named
@RequestScoped
public class VehiculoController {

	@Inject
	private IVehiculoService vService;
	@Inject
	private IConductorService cService;

	private Vehiculo vehiculo;
	private Conductor conductor;
	List<Vehiculo> listaVehiculos;
	List<Conductor> listaConductores;

	@PostConstruct
	public void init() {
		this.conductor = new Conductor();
		this.vehiculo = new Vehiculo();
		this.listaVehiculos = new ArrayList<Vehiculo>();
		this.listaConductores = new ArrayList<Conductor>();
		this.listarConductor();
		this.listarVehiculo();
	}

	public String nuevoVehiculo() {
		this.setVehiculo(new Vehiculo());
		return "vehiculo.xhtml";
	}

	public void insert() {

		try {
			vService.insert(vehiculo);

		} catch (Exception e) {
			System.out.println("Error al insertar en el controller de vehiculo");
		}

	}

	public void listarConductor() {

		try {
			listaConductores = cService.list();

		} catch (Exception e) {
			System.out.println("Error al listar en el controller de conductor-vehiculo");
		}
	}

	public void listarVehiculo() {
		try {
			listaVehiculos = vService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de vehiculo");
		}

	}

	public void eliminar(Vehiculo vehiculo) {
		try {
			vService.delete(vehiculo.getIdVehiculo());
			this.listarVehiculo();

		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de vehiculo");
		}
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Conductor getConductor() {
		return conductor;
	}

	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}

	public List<Vehiculo> getListaVehiculos() {
		return listaVehiculos;
	}

	public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}

	public List<Conductor> getListaConductores() {
		return listaConductores;
	}

	public void setListaConductores(List<Conductor> listaConductores) {
		this.listaConductores = listaConductores;
	}

}
