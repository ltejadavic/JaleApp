package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Viaje;

public interface IViajeService {

	public void insert(Viaje viaje);

	public List<Viaje> list();

	public void delete(int idViaje);

}
