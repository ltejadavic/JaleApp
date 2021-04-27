package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Speciality;

public interface ISpecialityService {

	public void insert(Speciality speciality);

	public List<Speciality> list();

	public void delete(int idSpeciality);
}
