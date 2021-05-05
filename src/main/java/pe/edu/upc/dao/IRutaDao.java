package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Ruta;

public interface IRutaDao {

	public void insert(Ruta ruta);

	public List<Ruta> list();

	public void delete(String idRuta);
}
