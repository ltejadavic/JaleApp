package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Speciality;

public interface ISpecialityDao {

	public void insert(Speciality speciality);

	public List<Speciality> list();

	public void delete(int idSpeciality);

}
