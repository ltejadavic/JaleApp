package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IViajeDao;
import pe.edu.upc.entity.Viaje;
import pe.edu.upc.service.IViajeService;

@Named
@RequestScoped
public class ViajeServiceimpl implements IViajeService {

	@Inject
	private IViajeDao vDao;

	@Override
	public void insert(Viaje viaje) {
		vDao.insert(viaje);

	}

	@Override
	public List<Viaje> list() {
		return vDao.list();
	}

	@Override
	public void delete(int idViaje) {
		vDao.delete(idViaje);

	}

}
