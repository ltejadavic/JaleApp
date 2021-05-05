package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IPasajeroDao;
import pe.edu.upc.entity.Pasajero;
import pe.edu.upc.service.IPasajeroService;

@Named
@RequestScoped
public class PasajeroServiceimpl implements IPasajeroService {

	@Inject
	private IPasajeroDao pDao;

	@Override
	public void insert(Pasajero pas) {
		pDao.insert(pas);

	}

	@Override
	public List<Pasajero> list() {

		return pDao.list();
	}

	@Override
	public void delete(String dniPasajero) {
		pDao.delete(dniPasajero);

	}

}