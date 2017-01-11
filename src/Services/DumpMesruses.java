package Services;

import java.io.FileWriter;
import java.util.*;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.management.PersistentMBean;

import DataBase.*;
import Services.Mesures;
import com.mysql.fabric.xmlrpc.base.Array;

import java.sql.*;
@WebService
public class DumpMesruses {
	public Mesures[] mesuresTab ;
	Connection connection;
	
	
	
	public DumpMesruses() {
	};
	
	@WebMethod
	public Mesures[] DumpDataDB(){
		
		try {
			connection = DataBaseConnection.getConnection();
			String sql = "SELECT * FROM datavalues;";
			PreparedStatement pst = connection.prepareStatement(sql);
			
			ResultSet rt = pst.executeQuery(sql);
			int i = 0;
			int len = 0;
			for(i=0; rt.next();i++){
				len++;
			}
			rt.close();
			ResultSet rs = pst.executeQuery(sql);
			mesuresTab = new Mesures[len];
			for(i=0; rs.next();i++){
				mesuresTab[i] = new Mesures();
				
				mesuresTab[i].setCondValue(rs.getInt("condValue"));
				mesuresTab[i].setTempValue(rs.getInt("tempValue"));
				mesuresTab[i].setMesureDate(rs.getString("mesureDate"));
				
				//System.out.println(/*rs.getInt("mesureID")*/mesuresTab[i].getMesureID());
			}

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		return mesuresTab;
	}

}
