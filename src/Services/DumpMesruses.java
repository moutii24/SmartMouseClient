package Services;

import java.beans.Statement;
import java.io.FileWriter;

import DataBase.DataBaseConnection;
import java.sql.*;
import java.util.*;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.management.PersistentMBean;



public class DumpMesruses {
	Connection connection;
	//DumpedData[] dataListe;

	public DumpMesruses(){};
	
	public ArrayList<DumpedData> DumpDataLocalDB(){
		ArrayList<DumpedData> dataListe = new ArrayList<DumpedData>();
		
		try {
			connection= DataBaseConnection.getConnection();
			String sql="SELECT * FROM datavalues";
			PreparedStatement pst = connection.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()){
				DumpedData ligneTable = new DumpedData();
				ligneTable.setMesureDumpedID(rs.getInt(1));
				ligneTable.setdCondValue(rs.getInt(2));
				ligneTable.setdTempValue(rs.getInt(3));
				ligneTable.setMesureDumpedDate(rs.getString(4));
				dataListe.add(ligneTable);
                }
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return dataListe;
	}
	
	
	
	
	
	
}



