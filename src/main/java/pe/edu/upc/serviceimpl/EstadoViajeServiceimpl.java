package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IEstadoViajeDao;
import pe.edu.upc.entity.EstadoViaje;
import pe.edu.upc.service.IEstadoViajeService;

@Named
public class EstadoViajeServiceimpl implements IEstadoViajeService {

	@Inject
	private IEstadoViajeDao esDao;

	@Override
	public void insert(EstadoViaje estado) {
		esDao.insert(estado);

	}

	@Override
	public List<EstadoViaje> list() {

		return esDao.list();
	}

	@Override
	public void delete(int idEstadoViaje) {
		esDao.delete(idEstadoViaje);

	}

}
