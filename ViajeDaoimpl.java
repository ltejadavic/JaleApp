package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IViajeDao;
import pe.edu.upc.entity.Viaje;

public class ViajeDaoimpl implements IViajeDao{

	@PersistenceContext(unitName = "jaleApp2")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Viaje viaje) {
		try {
			em.persist(viaje);
			
		} catch (Exception e) {
			System.out.println("Error en el daoImpl de viaje al insertar");
			System.out.println(e.getMessage());
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Viaje> list() {
		List<Viaje> lista = new ArrayList<Viaje>();
		try {
			Query q = em.createQuery("from Viaje m");
			lista = (List<Viaje>) q.getResultList();
			
		} catch (Exception e) {
			System.out.println("Error en el daoImpl de Viaje al listar");
			System.out.println(e.getMessage());
		}
		return lista;
	}

	@Transactional
	@Override
	public void delete(int idViaje) {
		Viaje viaje = new Viaje();
		try {
			viaje = em.getReference(Viaje.class, idViaje);
			em.remove(viaje);
			
		} catch (Exception e) {
			System.out.println("Error en el daoImpl de Viaje al eliminar");
			System.out.println(e.getMessage());
		}
		
	}

	@Transactional
	@Override
	public void update(Viaje viaje) {
		try {
			em.merge(viaje);

		} catch (Exception e) {
			System.out.println("Error en el daoImpl deviaje update");
			System.out.println(e.getMessage());
		}

	}
		
}
