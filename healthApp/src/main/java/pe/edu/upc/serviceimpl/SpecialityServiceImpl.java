package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ISpecialityDao;
import pe.edu.upc.entity.Speciality;
import pe.edu.upc.service.ISpecialityService;

@Named
@RequestScoped
public class SpecialityServiceImpl implements ISpecialityService {

	@Inject
	private ISpecialityDao sDao;

	@Override
	public void insert(Speciality speciality) {
		sDao.insert(speciality);

	}

	@Override
	public List<Speciality> list() {

		return sDao.list();
	}

	@Override
	public void delete(int idSpeciality) {
		sDao.delete(idSpeciality);

	}
}
