package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IReservacionDao;
import pe.edu.upc.entity.Reservacion;
import pe.edu.upc.service.IReservacionService;

@Named
@RequestScoped
public class ReservacionServiceimpl implements IReservacionService {

	@Inject
	private IReservacionDao rDao;

	@Override
	public void insert(Reservacion reservacion) {
		rDao.insert(reservacion);

	}

	@Override
	public List<Reservacion> list() {
		return rDao.list();
	}

	@Override
	public void delete(String idReservacion) {
		rDao.delete(idReservacion);
	}

}
