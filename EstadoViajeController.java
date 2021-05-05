package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.EstadoViaje;
import pe.edu.upc.service.IEstadoViajeService;

@Named
@RequestScoped
public class EstadoViajeController {

	@Inject
	private IEstadoViajeService esService;

//atributos
	private EstadoViaje estado;
	List<EstadoViaje> listaEstados;

//Constructors
	@PostConstruct
	public void init() {
		this.listaEstados = new ArrayList<EstadoViaje>();
		this.estado = new EstadoViaje();
		this.listar();
	}

//metodos
	public String nuevoEstadoViaje() {

		this.setEstado(new EstadoViaje());
		return "estado.xhtml";
	}

	public void insert() {

		try {

			esService.insert(estado);

		} catch (Exception e) {
			System.out.println("Error al insertar en el controller de EstadoViaje");
		}
	}

	public void listar() {

		try {

			listaEstados = esService.list();

		} catch (Exception e) {
			System.out.println("Error al listar en el controller de EstadoViaje");
		}

	}

	public void eliminar(EstadoViaje estado) {

		try {

			esService.delete(estado.getIdEstadoViaje());
			this.listar();

		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de EstadoViaje");
		}

	}

	public EstadoViaje getEstado() {
		return estado;
	}

	public void setEstado(EstadoViaje estado) {
		this.estado = estado;
	}

	public List<EstadoViaje> getListaEstados() {
		return listaEstados;
	}

	public void setListaEstados(List<EstadoViaje> listaEstados) {
		this.listaEstados = listaEstados;
	}

}
