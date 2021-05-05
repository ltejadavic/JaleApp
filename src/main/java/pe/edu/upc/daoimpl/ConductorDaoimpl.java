package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IConductorDao;
import pe.edu.upc.entity.Conductor;

public class ConductorDaoimpl implements IConductorDao {
	@PersistenceContext(unitName = "jaleApp2")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Conductor conductor) {
		try {
			em.persist(conductor);
		} catch (Exception e) {
			System.out.println("Error en el daoImpl de Conductor al insertar");
			System.out.println(e.getMessage());
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Conductor> list() {
		List<Conductor> lista = new ArrayList<Conductor>();
		try {
			Query q = em.createQuery("from Conductor m");
			lista = (List<Conductor>) q.getResultList();

		} catch (Exception e) {
			System.out.println("Error en el daoImpl de Conductor al listar");
			System.out.println(e.getMessage());
		}
		return lista;
	}

	@Transactional
	@Override
	public void delete(String dniConductor) {
		Conductor conductor = new Conductor();
		try {
			conductor = em.getReference(Conductor.class, dniConductor);
			em.remove(conductor);
		} catch (Exception e) {
			System.out.println("Error en el daoImpl de Conductor al eliminar");
			System.out.println(e.getMessage());
		}

	}

}
