package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IEstadoViajeDao;
import pe.edu.upc.entity.EstadoViaje;

public class EstadoViajeDaoimpl implements IEstadoViajeDao {
	@PersistenceContext(unitName = "jaleApp2")
	private EntityManager em;

	@Override
	@Transactional
	public void insert(EstadoViaje estado) {
		try {
			em.persist(estado);

		} catch (Exception e) {
			System.out.println("Error al insertar EstadoViaje");
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<EstadoViaje> list() {
		List<EstadoViaje> lista = new ArrayList<EstadoViaje>();
		try {
			Query q = em.createQuery("from EstadoViaje m");
			lista = (List<EstadoViaje>) q.getResultList();

		} catch (Exception e) {
			System.out.println("Error al listar EstadoViaje");
			System.out.println(e.getLocalizedMessage());
		}
		return lista;
	}

	@Override
	@Transactional
	public void delete(int idEstadoViaje) {
		EstadoViaje estado = new EstadoViaje();
		try {
			estado = em.getReference(EstadoViaje.class, idEstadoViaje);
			em.remove(estado);

		} catch (Exception e) {
			System.out.println("Error al elimiar EstadoViaje");
		}

	}

}
