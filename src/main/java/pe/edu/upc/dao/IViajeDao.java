package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Viaje;

public interface IViajeDao {
	public void insert(Viaje viaje);

	public List<Viaje> list();

	public void delete(int idViaje);

}
