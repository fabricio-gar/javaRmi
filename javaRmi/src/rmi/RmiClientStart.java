package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;



public class RmiClientStart {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		HelloService service = (HelloService) Naming.lookup("rmi://189.48.80.221:5099/hello");
		System.out.println(service.echo("hey"));

	}

}
