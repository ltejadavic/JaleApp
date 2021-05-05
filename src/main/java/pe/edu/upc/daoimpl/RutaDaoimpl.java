package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IRutaDao;
import pe.edu.upc.entity.Ruta;

public class RutaDaoimpl implements IRutaDao {
	@PersistenceContext(unitName = "jaleApp2")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Ruta ruta) {
		try {
			em.persist(ruta);
		} catch (Exception e) {
			System.out.println("Error en el daoImpl de Ruta al insertar");
			System.out.println(e.getMessage());
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Ruta> list() {
		List<Ruta> lista = new ArrayList<Ruta>();
		try {
			Query q = em.createQuery("from Ruta m");
			lista = (List<Ruta>) q.getResultList();

		} catch (Exception e) {
			System.out.println("Error en el daoImpl de Ruta al listar");
			System.out.println(e.getMessage());
		}
		return lista;
	}

	@Transactional
	@Override
	public void delete(String idRuta) {
		Ruta ruta = new Ruta();
		try {
			ruta = em.getReference(Ruta.class, idRuta);
			em.remove(ruta);

		} catch (Exception e) {
			System.out.println("Error en el daoImpl de Ruta al eliminar");
			System.out.println(e.getMessage());
		}

	}

}
