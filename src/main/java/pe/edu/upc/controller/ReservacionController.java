package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Conductor;
import pe.edu.upc.entity.Reservacion;
import pe.edu.upc.entity.Ruta;
import pe.edu.upc.service.IConductorService;
import pe.edu.upc.service.IReservacionService;
import pe.edu.upc.service.IRutaService;

@Named
@RequestScoped
public class ReservacionController {

	@Inject
	private IReservacionService rService;
	@Inject
	private IRutaService ruService;
	@Inject
	private IConductorService cService;

	private Reservacion reservacion;
	private Ruta ruta;
	private Conductor conductor;

	List<Reservacion> listaReservaciones;
	List<Ruta> listaRutas;
	List<Conductor> listaConductores;

	@PostConstruct
	public void init() {
		this.conductor = new Conductor();
		this.ruta = new Ruta();
		this.reservacion = new Reservacion();
		this.listaReservaciones = new ArrayList<Reservacion>();
		this.listaRutas = new ArrayList<Ruta>();
		this.listaConductores = new ArrayList<Conductor>();
		this.listarReservacion();
		this.listarConductor();
		this.listarRuta();
	}

	public String nuevoReservacion() {
		this.setReservacion(new Reservacion());
		return "reservacion.xhtml";
	}

	public void insert() {

		try {
			rService.insert(reservacion);

		} catch (Exception e) {
			System.out.println("Error al insertar en el controller de reservacion");
		}

	}

	public void listarReservacion() {

		try {
			listaReservaciones = rService.list();

		} catch (Exception e) {
			System.out.println("Error al listar en el controller de reservacion");
		}
	}

	public void listarConductor() {

		try {
			listaConductores = cService.list();

		} catch (Exception e) {
			System.out.println("Error al listar en el controller de conductor-reservacion");
		}
	}

	public void listarRuta() {
		try {
			listaRutas = ruService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de ruta - reservacion");
		}

	}

	public void eliminar(Reservacion reservacion) {
		try {
			rService.delete(reservacion.getIdReservacion());
			this.listarReservacion();

		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de reservacion");
		}
	}

	public Reservacion getReservacion() {
		return reservacion;
	}

	public void setReservacion(Reservacion reservacion) {
		this.reservacion = reservacion;
	}

	public Ruta getRuta() {
		return ruta;
	}

	public void setRuta(Ruta ruta) {
		this.ruta = ruta;
	}

	public Conductor getConductor() {
		return conductor;
	}

	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}

	public List<Reservacion> getListaReservaciones() {
		return listaReservaciones;
	}

	public void setListaReservaciones(List<Reservacion> listaReservaciones) {
		this.listaReservaciones = listaReservaciones;
	}

	public List<Ruta> getListaRutas() {
		return listaRutas;
	}

	public void setListaRutas(List<Ruta> listaRutas) {
		this.listaRutas = listaRutas;
	}

	public List<Conductor> getListaConductores() {
		return listaConductores;
	}

	public void setListaConductores(List<Conductor> listaConductores) {
		this.listaConductores = listaConductores;
	}

}
