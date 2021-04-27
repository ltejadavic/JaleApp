package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IMedicCenterDao;
import pe.edu.upc.entity.MedicCenter;

public class MedicCenterDaoImpl implements IMedicCenterDao {

	@PersistenceContext(unitName = "healthApp")
	private EntityManager em;

	@Transactional
	public void insert(MedicCenter medic) {
		try {

			em.persist(medic);

		} catch (Exception e) {
			System.out.println("Error al insertar Centro Medico");
		}
	}

	@SuppressWarnings("unchecked")
	public List<MedicCenter> list() {

		List<MedicCenter> lista = new ArrayList<MedicCenter>();

		try {

			Query q = em.createQuery("from MedicCenter m");
			lista = (List<MedicCenter>) q.getResultList();

		} catch (Exception e) {
			System.out.println("Error al listar centro medicos");
			System.out.println(e.getLocalizedMessage());
		}

		return lista;
	}

	@Transactional
	public void delete(int idMedicCenter) {
		MedicCenter med = new MedicCenter();
		try {

			med = em.getReference(MedicCenter.class, idMedicCenter);
			em.remove(med);

		} catch (Exception e) {
			System.out.println("Error al eliminar centro medicos");

		}

	}
}
