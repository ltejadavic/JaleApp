package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Pasajero;
import pe.edu.upc.entity.Usuario;
import pe.edu.upc.service.IPasajeroService;
import pe.edu.upc.service.IUsuarioService;

@Named
@RequestScoped
public class PasajeroController {

	// Service
	@Inject
	private IPasajeroService pService;
	@Inject
	private IUsuarioService uService;

	// atributos
	private Pasajero pasajero;
	private Usuario usuario;
	List<Pasajero> listaPasajeros;
	List<Usuario> listaUsuarios;

	@PostConstruct
	public void init() {
		this.usuario = new Usuario();
		this.pasajero = new Pasajero();
		this.listaUsuarios = new ArrayList<Usuario>();
		this.listaPasajeros = new ArrayList<Pasajero>();
		this.listarUsuario();
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

	public void listarUsuario() {

		try {
			listaUsuarios = uService.list();

		} catch (Exception e) {
			System.out.println("Error al listar en el controller de pasajero-user");
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
			pService.delete(pasajero.getIdPasajero());
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Pasajero> getListaPasajeros() {
		return listaPasajeros;
	}

	public void setListaPasajeros(List<Pasajero> listaPasajeros) {
		this.listaPasajeros = listaPasajeros;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

}
