package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Conductor;

public interface IConductorService {
	public void insert(Conductor conductor);

	public List<Conductor> list();

	public void delete(String dniConductor);

}
