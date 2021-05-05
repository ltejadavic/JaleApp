package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Vehiculo;

public interface IVehiculoDao {

	public void insert(Vehiculo vehiculo);

	public List<Vehiculo> list();

	public void delete(String idVehiculo);
}
