package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IConductorDao;
import pe.edu.upc.entity.Conductor;
import pe.edu.upc.service.IConductorService;

@Named
@RequestScoped
public class ConductorServiceimpl implements IConductorService {

	@Inject
	private IConductorDao cDao;

	@Override
	public void insert(Conductor conductor) {
		cDao.insert(conductor);
	}

	@Override
	public List<Conductor> list() {
		return cDao.list();
	}

	@Override
	public void delete(String dniConductor) {
		cDao.delete(dniConductor);
	}

	@Override
	public List<Conductor> findByNameConductor(Conductor co) {
		return cDao.findByNameConductor(co);
	}

}
