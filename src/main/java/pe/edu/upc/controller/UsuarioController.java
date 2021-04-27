package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Usuario;
import pe.edu.upc.service.IUsuarioService;

@Named
@RequestScoped
public class UsuarioController {

	@Inject
	private IUsuarioService usService;

//atributos	
	private Usuario user;
	List<Usuario> listaUsers;

//Constructors
	@PostConstruct
	public void init() {
		this.listaUsers = new ArrayList<Usuario>();
		this.user = new Usuario();
		this.listar();
	}

//metodos
	public String nuevoUsuario() {

		this.setUser(new Usuario());
		return "usuario.xhtml";
	}

	public void insert() {

		try {

			usService.insert(user);

		} catch (Exception e) {
			System.out.println("Error al insertar en el controller de Usuario");
		}
	}

	public void listar() {

		try {

			listaUsers = usService.list();

		} catch (Exception e) {
			System.out.println("Error al listar en el controller de Usuario");
		}

	}

	public void eliminar(Usuario user) {

		try {

			usService.delete(user.getDniUser());
			this.listar();

		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de Usuario");
		}

	}

//Getters y Setters	
	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}

	public List<Usuario> getListaUsers() {
		return listaUsers;
	}

	public void setListaUsers(List<Usuario> listaUsers) {
		this.listaUsers = listaUsers;
	}
}
