package Application;

import Services.DumpMesruses;
import Services.Requester;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Endpoint;
import javax.xml.ws.Service;
import SubmitMouse.SmartMouseServer.*;
import Services.DumpMesruses;
public class Main {
	public static void main(String args[]) throws Exception {

		/*try {
			Endpoint.publish("http://localhost:8090/", new Requester());
			System.out.println("Deployement avec succès");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Port déja utilisé ...");
		}*/
		//MouseSubmitSoapProxy ws = new MouseSubmitSoapProxy();
		//System.out.println(ws.submitMouse());
		DumpMesruses dp = new DumpMesruses();
		dp.DumpDataDB();
		System.out.println(dp);
		
	}
}