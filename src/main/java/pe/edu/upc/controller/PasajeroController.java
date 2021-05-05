package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Pasajero;
import pe.edu.upc.service.IPasajeroService;

@Named
@RequestScoped
public class PasajeroController {

	// Service
	@Inject
	private IPasajeroService pService;

	// atributos
	private Pasajero pasajero;
	List<Pasajero> listaPasajeros;

	@PostConstruct
	public void init() {

		this.pasajero = new Pasajero();
		this.listaPasajeros = new ArrayList<Pasajero>();
		this.listarPasajero();

	}

	// metodos
	public String nuevoPasajero() {
		this.setPasajero(new Pasajero());
		return "pasajero.xhtml";
	}

	public void insert() {

		try {
			pService.insert(pasajero);

		} catch (Exception e) {
			System.out.println("Error al insertar en el controller de pasajero");
		}

	}

	public void listarPasajero() {
		try {
			listaPasajeros = pService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de pasajero");
		}

	}

	public void eliminar(Pasajero pasajero) {
		try {
			pService.delete(pasajero.getDniPasajero());
			this.listarPasajero();

		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de pasajero");
		}

	}

	// get y set
	public Pasajero getPasajero() {
		return pasajero;
	}

	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}

	public List<Pasajero> getListaPasajeros() {
		return listaPasajeros;
	}

	public void setListaPasajeros(List<Pasajero> listaPasajeros) {
		this.listaPasajeros = listaPasajeros;
	}

}