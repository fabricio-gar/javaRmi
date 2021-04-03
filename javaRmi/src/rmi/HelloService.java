package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;




public interface HelloService extends Remote {
public String echo(String input ) throws RemoteException;
	
	public List<Pessoa> buscaPessoas() throws RemoteException;
}
