package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IUsuarioDao;
import pe.edu.upc.entity.Usuario;

public class UsuarioDaoimpl implements IUsuarioDao {
	@PersistenceContext(unitName = "jaleApp2")
	private EntityManager em;

	@Transactional
	public void insert(Usuario user) {
		try {

			em.persist(user);

		} catch (Exception e) {
			System.out.println("Error al insertar User");
		}

	}

	@SuppressWarnings("unchecked")
	public List<Usuario> list() {

		List<Usuario> lista = new ArrayList<Usuario>();
		try {

			Query q = em.createQuery("from Usuario m");
			lista = (List<Usuario>) q.getResultList();

		} catch (Exception e) {
			System.out.println("Error al listar User");
			System.out.println(e.getLocalizedMessage());
		}

		return lista;
	}

	@Transactional
	public void delete(int dniUser) {
		Usuario user = new Usuario();
		try {
			user = em.getReference(Usuario.class, dniUser);
			em.remove(user);
		} catch (Exception e) {
			System.out.println("Error al elimiar User");
		}

	}
}
