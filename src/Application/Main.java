package Application;

import Services.DumpMesruses;
import Services.Requester;

import java.net.URL;
import java.util.ArrayList;

import Services.DumpMesruses;

import javax.xml.namespace.QName;
import javax.xml.ws.Endpoint;
import javax.xml.ws.Service;

import org.SubmitMouse.WebService.ACK.*;

public class Main {
	public static void main(String args[]) throws Exception {

		try {
			Endpoint.publish("http://localhost:8011/", new Requester());
			System.out.println("Deployement avec succès");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Port déja utilisé ...");
		}

		WebServiceSoapProxy ws = new WebServiceSoapProxy();

		System.out.println(ws.helloWorld());
		/*
		 * DumpMesruses dm = new DumpMesruses(); ArrayList<DumpMesruses> dd =
		 * new ArrayList<DumpMesruses>(); for(int i = 0 ;
		 * i<dm.DumpDataLocalDB().size();i++){
		 * System.out.println(dm.DumpDataLocalDB().get(i).mesureDumpedID +
		 * " - Coductence : " +dm.DumpDataLocalDB().get(i).dCondValue +
		 * " | Tempurature : "
		 * +dm.DumpDataLocalDB().get(i).dTempValue+" | Date : "
		 * +dm.DumpDataLocalDB().get(i).mesureDumpedDate); }
		 */
	}
}