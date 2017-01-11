package Services;

import IServices.IRequester;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.jws.WebMethod;
import javax.jws.WebService;

/*import java.io.*;
 import java.net.*;*/

/**
 * Created by Black Bird on 22/12/2016.
 */
@WebService
public class Requester implements IRequester {
	String mouseNumber = "M00001";
	MouseInformations mouse = new MouseInformations();

	@WebMethod
	public MouseInformations SubmitMouse() {
		mouse.setID(mouseNumber);
		DateTimeFormatter dtf = DateTimeFormatter
				.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		mouse.setConnectionDate(dtf.format(now));
		mouse.setUserIP("127.0.0.1");

		return mouse;
	}
}
