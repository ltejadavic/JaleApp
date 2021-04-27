package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Usuario;

public interface IUsuarioDao {

	public void insert(Usuario user);

	public List<Usuario> list();

	public void delete(int dniUser);
}
