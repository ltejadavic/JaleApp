package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IUsuarioDao;
import pe.edu.upc.entity.Usuario;
import pe.edu.upc.service.IUsuarioService;

@Named
public class UsuarioServiceimpl implements IUsuarioService  {
	@Inject
	private IUsuarioDao usDao;

	public void insert(Usuario user) {
		usDao.insert(user);

	}

	public List<Usuario> list() {

		return usDao.list();
	}

	public void delete(int dniUser) {
		usDao.delete(dniUser);

	}


}
