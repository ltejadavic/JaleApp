package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ISpecialityDao;
import pe.edu.upc.entity.Speciality;

public class SpecialityDaoImpl implements ISpecialityDao {

	@PersistenceContext(unitName = "healthApp")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Speciality speciality) {

		try {
			em.persist(speciality);
		} catch (Exception e) {
			System.out.println("Error en el daoImpl de Speciality Insertar");
			System.out.println(e.getMessage());
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Speciality> list() {

		List<Speciality> lista = new ArrayList<Speciality>();
		try {
			Query q = em.createQuery("from Speciality s");
			lista = (List<Speciality>) q.getResultList();

		} catch (Exception e) {
			System.out.println("Error en el daoImpl de Speciality Listar");
			System.out.println(e.getMessage());
		}
		return lista;
	}

	@Transactional
	@Override
	public void delete(int idSpeciality) {
		Speciality spec = new Speciality();
		try {

			spec = em.getReference(Speciality.class, idSpeciality);
			em.remove(spec);

		} catch (Exception e) {
			System.out.println("Error en el daoImpl de Speciality Eliminar");
			System.out.println(e.getMessage());
		}

	}

}
