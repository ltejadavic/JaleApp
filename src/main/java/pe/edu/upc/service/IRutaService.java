package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Ruta;

public interface IRutaService {
	public void insert(Ruta ruta);

	public List<Ruta> list();

	public void delete(String idRuta);

}
