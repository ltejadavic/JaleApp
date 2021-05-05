package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IVehiculoDao;
import pe.edu.upc.entity.Vehiculo;
import pe.edu.upc.service.IVehiculoService;

@Named
@RequestScoped
public class VehiculoServiceimpl implements IVehiculoService {

	@Inject
	private IVehiculoDao vDao;

	@Override
	public void insert(Vehiculo vehiculo) {
		vDao.insert(vehiculo);
	}

	@Override
	public List<Vehiculo> list() {

		return vDao.list();
	}

	@Override
	public void delete(String idVehiculo) {
		vDao.delete(idVehiculo);

	}

}
