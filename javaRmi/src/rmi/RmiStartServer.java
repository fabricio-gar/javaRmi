package rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;



public class RmiStartServer {

	public static void main(String[] args) throws RemoteException {
		System.setProperty("java.rmi.server.hostname","192.168.0.70");

		Registry registry = LocateRegistry.createRegistry(1099);
		
		
		Registry registry1 = LocateRegistry.createRegistry(1100);
		registry.rebind("hello", new HelloServant());
		registry1.rebind("utils", new UtilsServant());
	
		Pessoa pessoa1 = new Pessoa("fabricio@ufpa.br", "Fabricio",
				"Garcia", "Belém", "Engenharia da Computação",
				"Programação Java", "Desenvolvimento java 3 anos");
		Pessoa pessoa2 = new Pessoa("daniel@ufpa.br", "Daniel",
				"Faroas", "Belém", "Engenharia da Computação",
				"Programação Android", "Desenvolvimento Kotlin 1 ano");
		Pessoas.pessoas.add(pessoa1);
		Pessoas.pessoas.add(pessoa2);
	}

}
