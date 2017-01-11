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
				int id = rs.getInt("mesureID");
				mesuresTab[i].setMesureID(id);
/*				mesuresTab.setMesureID(rs.getInt("mesureID"));
				mesuresTab.setCondValue(rs.getInt("condValue"));
				mesuresTab.setTempValue(rs.getInt("tempValue"));
				mesuresTab.setMesureDate(rs.getString("mesureDate"));*/
				
				System.out.println(/*rs.getInt("mesureID")*/id);
			}

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		return mesuresTab;
	}

}
