package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.EstadoViaje;
import pe.edu.upc.entity.Reservacion;
import pe.edu.upc.entity.Viaje;
import pe.edu.upc.service.IEstadoViajeService;
import pe.edu.upc.service.IReservacionService;
import pe.edu.upc.service.IViajeService;

@Named
@RequestScoped
public class ViajeController {

	// Service
	@Inject
	private IViajeService vService;
	@Inject
	private IEstadoViajeService esService;
	@Inject
	private IReservacionService rService;

	// atributos
	private Viaje viaje;
	private EstadoViaje estado;
	private Reservacion reservacion;
	List<Viaje> listaViajes;
	List<EstadoViaje> listaEstados;
	List<Reservacion> listaReservaciones;

	@PostConstruct
	public void init() {
		this.estado = new EstadoViaje();
		this.viaje = new Viaje();
		this.reservacion = new Reservacion();
		this.listaViajes = new ArrayList<Viaje>();
		this.listaEstados = new ArrayList<EstadoViaje>();
		this.listaReservaciones = new ArrayList<Reservacion>();
		this.listarEstadoViaje();
		this.listarViaje();
		this.listarReservacion();
	}

	// metodos
	public String nuevoViaje() {
		this.setViaje(new Viaje());
		return "viaje.xhtml";
	}

	public void insert() {

		try {
			vService.insert(viaje);

		} catch (Exception e) {
			System.out.println("Error al insertar en el controller de viaje");
		}

	}

	public void listarEstadoViaje() {

		try {
			listaEstados = esService.list();

		} catch (Exception e) {
			System.out.println("Error al listar en el controller de estado-viaje");
		}
	}

	public void listarViaje() {
		try {
			listaViajes = vService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de viaje");
		}

	}
	
	public void listarReservacion() {
		try {
			listaReservaciones = rService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de viaje-reservaciones");
		}

	}

	public void eliminar(Viaje viaje) {
		try {
			vService.delete(viaje.getIdViaje());
			this.listarViaje();

		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de viaje");
		}
	}
	
	public String modifPre(Viaje via) {

		this.setViaje(via);
		return "viajeMod.xhtml";
	}

	public void modificar() {
		try {
			vService.update(this.viaje);
		} catch (Exception e) {
			System.out.println("Error al modificar en el controller de viaje");
		}
	}

	public Viaje getViaje() {
		return viaje;
	}

	public void setViaje(Viaje viaje) {
		this.viaje = viaje;
	}

	public EstadoViaje getEstado() {
		return estado;
	}

	public void setEstado(EstadoViaje estado) {
		this.estado = estado;
	}

	public List<Viaje> getListaViajes() {
		return listaViajes;
	}

	public void setListaViajes(List<Viaje> listaViajes) {
		this.listaViajes = listaViajes;
	}

	public List<EstadoViaje> getListaEstados() {
		return listaEstados;
	}

	public void setListaEstados(List<EstadoViaje> listaEstados) {
		this.listaEstados = listaEstados;
	}

	public Reservacion getReservacion() {
		return reservacion;
	}

	public void setReservacion(Reservacion reservacion) {
		this.reservacion = reservacion;
	}

	public List<Reservacion> getListaReservaciones() {
		return listaReservaciones;
	}

	public void setListaReservaciones(List<Reservacion> listaReservaciones) {
		this.listaReservaciones = listaReservaciones;
	}

}
