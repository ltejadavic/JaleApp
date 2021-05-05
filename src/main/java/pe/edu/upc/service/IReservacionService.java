package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Reservacion;

public interface IReservacionService {

	public void insert(Reservacion reservacion);

	public List<Reservacion> list();

	public void delete(String idReservacion);

}
