package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IPasajeroDao;
import pe.edu.upc.entity.Pasajero;

public class PasajeroDaoimpl implements IPasajeroDao {
	@PersistenceContext(unitName = "jaleApp2")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Pasajero pas) {
		try {
			em.persist(pas);
		} catch (Exception e) {
			System.out.println("Error en el daoImpl de Pasajero al insertar");
			System.out.println(e.getMessage());
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Pasajero> list() {
		List<Pasajero> lista = new ArrayList<Pasajero>();
		try {
			Query q = em.createQuery("from Pasajero m");
			lista = (List<Pasajero>) q.getResultList();

		} catch (Exception e) {
			System.out.println("Error en el daoImpl de Pasajero al listar");
			System.out.println(e.getMessage());
		}
		return lista;
	}

	@Transactional
	@Override
	public void delete(String dniPasajero) {
		Pasajero pas = new Pasajero();
		try {
			pas = em.getReference(Pasajero.class, dniPasajero);
			em.remove(pas);
		} catch (Exception e) {
			System.out.println("Error en el daoImpl de Pasajero al eliminar");
			System.out.println(e.getMessage());
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Pasajero> findByNamePasajeror(Pasajero pa) {
		List<Pasajero> lista = new ArrayList<Pasajero>();
		try {

			Query q = em.createQuery("from Pasajero m where m.namePasajero like ?1");
			q.setParameter(1, "%" + pa.getNamePasajero() + "%");
			lista = (List<Pasajero>) q.getResultList();

		} catch (Exception e) {
			System.out.println("Error al buscar Pasajeros");
			System.out.println(e.getLocalizedMessage());
		}

		return lista;
	}

}