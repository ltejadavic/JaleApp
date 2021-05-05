package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IVehiculoDao;
import pe.edu.upc.entity.Vehiculo;

public class VehiculoDaoimpl implements IVehiculoDao {

	@PersistenceContext(unitName = "jaleApp2")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Vehiculo vehiculo) {
		try {
			em.persist(vehiculo);

		} catch (Exception e) {
			System.out.println("Error en el daoImpl de vehiculo al insertar");
			System.out.println(e.getMessage());
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Vehiculo> list() {
		List<Vehiculo> lista = new ArrayList<Vehiculo>();
		try {
			Query q = em.createQuery("from Vehiculo m");
			lista = (List<Vehiculo>) q.getResultList();

		} catch (Exception e) {
			System.out.println("Error en el daoImpl de Vehiculo al listar");
			System.out.println(e.getMessage());
		}
		return lista;
	}

	@Transactional
	@Override
	public void delete(String idVehiculo) {
		Vehiculo vehiculo = new Vehiculo();
		try {
			vehiculo = em.getReference(Vehiculo.class, idVehiculo);
			em.remove(vehiculo);

		} catch (Exception e) {
			System.out.println("Error en el daoImpl de Vehiculo al eliminar");
			System.out.println(e.getMessage());
		}

	}

}
