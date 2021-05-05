
package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Pasajero;

public interface IPasajeroService {
	public void insert(Pasajero pas);

	public List<Pasajero> list();

	public void delete(String dniPasajero);

	public List<Pasajero> findByNamePasajeror(Pasajero pa);

}