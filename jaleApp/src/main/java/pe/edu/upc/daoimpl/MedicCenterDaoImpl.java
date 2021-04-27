package pe.edu.upc.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import pe.edu.upc.conexion.Conexion;
import pe.edu.upc.dao.IMedicCenterDao;
import pe.edu.upc.entity.MedicCenter;

public class MedicCenterDaoImpl implements IMedicCenterDao{
	private Connection oCn;
	
	public MedicCenterDaoImpl() {
		oCn = Conexion.abiriConexion();
	}

	public void insert(MedicCenter medic) {
		try {
			String sql = "insert into Usuario(DUsuario, TDireccion, DEmail, DTIU) values(?,?,?,?)";
			PreparedStatement ps = oCn.prepareStatement(sql);
			ps.setString(1, medic.getNameMedicCenter());
			ps.setString(2, medic.getAdressMedicCenter());
			ps.setString(3, medic.getEmailMedicCenter());
			ps.setString(4, medic.getTiuMedicCenter());
			ps.executeUpdate();
			ps.close();
		} catch (Exception e) {
			System.out.println("Error al insertar Centro Medico");
		}
	}

	public List<MedicCenter> list() {
		
		List<MedicCenter> lista = new ArrayList<MedicCenter>();
		try {
			String sql = "select * from Usuario";
			PreparedStatement ps = oCn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery(sql);
			while (rs.next()) {
				MedicCenter m = new MedicCenter();
				m.setIdMedicCenter(rs.getInt("CDNI"));
				m.setNameMedicCenter(rs.getString("DUsuario"));
				m.setAdressMedicCenter(rs.getString("TDireccion"));
				m.setEmailMedicCenter(rs.getString("DEmail"));
				m.setTiuMedicCenter(rs.getString("DTIU"));
				lista.add(m);
				
				
			}
			ps.close();
		} catch (Exception e) {
			System.out.println("Error al listar centro medicos");
			System.out.println(e.getLocalizedMessage());
		}
		
		return lista;
	}

	public void delete(int idMedicCenter) {
		try {
			String sql = "delete from Usuario where CDNI = ?";
			PreparedStatement ps = oCn.prepareStatement(sql);
			ps.setInt(1, idMedicCenter);
			ps.executeUpdate();
			ps.close();
		} catch (Exception e) {
			System.out.println("Error al eliminar centro medicos");
			
		}
		
	}
}
