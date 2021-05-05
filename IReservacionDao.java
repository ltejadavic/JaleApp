package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Reservacion;

public interface IReservacionDao {

	public void insert(Reservacion reservacion);

	public List<Reservacion> list();

	public void delete(String idReservacion);
}
