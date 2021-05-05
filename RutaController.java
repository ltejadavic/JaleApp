package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Pasajero;
import pe.edu.upc.entity.Ruta;
import pe.edu.upc.service.IPasajeroService;
import pe.edu.upc.service.IRutaService;

@Named
@RequestScoped
public class RutaController {

	@Inject
	private IRutaService rService;
	@Inject
	private IPasajeroService pService;

	private Ruta ruta;
	private Pasajero pasajero;
	List<Ruta> listaRutas;
	List<Pasajero> listaPasajeros;

	@PostConstruct
	public void init() {
		this.pasajero = new Pasajero();
		this.ruta = new Ruta();
		this.listaRutas = new ArrayList<Ruta>();
		this.listaPasajeros = new ArrayList<Pasajero>();
		this.listarPasajero();
		this.listarRuta();
	}

	public String nuevoRuta() {
		this.setRuta(new Ruta());
		return "ruta.xhtml";
	}

	public void insert() {

		try {
			rService.insert(ruta);

		} catch (Exception e) {
			System.out.println("Error al insertar en el controller de ruta");
		}

	}

	public void listarPasajero() {

		try {
			listaPasajeros = pService.list();

		} catch (Exception e) {
			System.out.println("Error al listar en el controller de pasajero-ruta");
		}
	}

	public void listarRuta() {
		try {
			listaRutas = rService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de ruta");
		}

	}

	public void eliminar(Ruta ruta) {
		try {
			rService.delete(ruta.getIdRuta());
			this.listarRuta();

		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de ruta");
		}
	}

	public Ruta getRuta() {
		return ruta;
	}

	public void setRuta(Ruta ruta) {
		this.ruta = ruta;
	}

	public Pasajero getPasajero() {
		return pasajero;
	}

	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}

	public List<Ruta> getListaRutas() {
		return listaRutas;
	}

	public void setListaRutas(List<Ruta> listaRutas) {
		this.listaRutas = listaRutas;
	}

	public List<Pasajero> getListaPasajeros() {
		return listaPasajeros;
	}

	public void setListaPasajeros(List<Pasajero> listaPasajeros) {
		this.listaPasajeros = listaPasajeros;
	}

}
