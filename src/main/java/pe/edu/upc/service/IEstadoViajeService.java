package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.EstadoViaje;

public interface IEstadoViajeService {

	public void insert(EstadoViaje estado);

	public List<EstadoViaje> list();

	public void delete(int idEstadoViaje);

}
