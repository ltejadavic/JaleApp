package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IRutaDao;
import pe.edu.upc.entity.Ruta;
import pe.edu.upc.service.IRutaService;

@Named
@RequestScoped
public class RustaServiceimpl implements IRutaService {

	@Inject
	private IRutaDao rDao;

	@Override
	public void insert(Ruta ruta) {
		rDao.insert(ruta);
	}

	@Override
	public List<Ruta> list() {
		return rDao.list();
	}

	@Override
	public void delete(String idRuta) {
		rDao.delete(idRuta);
	}

}
