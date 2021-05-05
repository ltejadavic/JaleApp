package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.EstadoViaje;

public interface IEstadoViajeDao {

	public void insert(EstadoViaje estado);

	public List<EstadoViaje> list();

	public void delete(int idEstadoViaje);
}
