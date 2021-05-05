package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Pasajero;

public interface IPasajeroDao {

	public void insert(Pasajero pas);

	public List<Pasajero> list();

	public void delete(String dniPasajero);
}
