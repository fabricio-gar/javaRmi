package rmi;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;







/*
Classname: HelloServerDemo
Purpose: The RMI server.
*/



public class HelloServant extends UnicastRemoteObject implements HelloService{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8499873457348754245L;

	public HelloServant() throws RemoteException {
		super();
	}
	
	public String echo(String input) {
		System.out.println(input);
		return "Hello World from RMI server!";
	}

	@Override
	public List<Pessoa> buscaPessoas() {
		
		return Pessoas.pessoas;
	}



	
	
	


}