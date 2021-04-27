package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.MedicCenter;
import pe.edu.upc.service.IMedicCenterService;
@Named
@RequestScoped
public class MedicCenterController {
	@Inject
	private IMedicCenterService mcService;	

	private MedicCenter medic;
	List<MedicCenter> listaCentrosMedicos;
	//constructores
	
	@PostConstruct
	public void init() {
		this.listaCentrosMedicos = new ArrayList<MedicCenter>();
		this.medic = new MedicCenter();
		this.listar();
	}
	//metodos
	
	public String nuevoMedicCenter() {
		
		this.setMedic(new MedicCenter());
		return "medicCenter.xhtml";
	}
	
	public void insert() {
		try {
			
			mcService.insert(medic);
			
		} catch (Exception e) {
			System.out.println("Error al insertar controller en Medic Center");
		}
	}
	
	public void listar() {
		try {
			
			listaCentrosMedicos =  mcService.list();
			
		} catch (Exception e) {
			System.out.println("Error al insertar controller en Medic Center");
		}
	}
	
	public void eliminar(MedicCenter medic){
		
		try {
			
			mcService.delete(medic.getIdMedicCenter());
			this.listar();
			
		} catch (Exception e) {
			System.out.println("Error al eliminar controller en Medic Center");
		}
		
	}
	
	//get y set
	public MedicCenter getMedic() {
		return medic;
	}
	public void setMedic(MedicCenter medic) {
		this.medic = medic;
	}
	
	public List<MedicCenter> getListaCentrosMedicos() {
		return listaCentrosMedicos;
	}
	
	public void setListaCentrosMedicos(List<MedicCenter> listaCentrosMedicos) {
		this.listaCentrosMedicos = listaCentrosMedicos;
	}
	
	
}
