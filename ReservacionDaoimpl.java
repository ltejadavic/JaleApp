package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IReservacionDao;
import pe.edu.upc.entity.Reservacion;

public class ReservacionDaoimpl implements IReservacionDao {

	@PersistenceContext(unitName = "jaleApp2")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Reservacion reservacion) {
		try {
			em.persist(reservacion);
		} catch (Exception e) {
			System.out.println("Error en el daoImpl de Reservacion al insertar");
			System.out.println(e.getMessage());
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Reservacion> list() {
		List<Reservacion> lista = new ArrayList<Reservacion>();
		try {
			Query q = em.createQuery("from Reservacion m");
			lista = (List<Reservacion>) q.getResultList();

		} catch (Exception e) {
			System.out.println("Error en el daoImpl de Reservacion al listar");
			System.out.println(e.getMessage());
		}
		return lista;
	}

	@Transactional
	@Override
	public void delete(String idReservacion) {
		Reservacion reservacion = new Reservacion();
		try {
			reservacion = em.getReference(Reservacion.class, idReservacion);
			em.remove(reservacion);

		} catch (Exception e) {
			System.out.println("Error en el daoImpl de Reservacion al eliminar");
			System.out.println(e.getMessage());
		}

	}

}
