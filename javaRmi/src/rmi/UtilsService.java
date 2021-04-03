package rmi;


import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface UtilsService extends Remote{
	
	public  void buscaPorCurso(List<Pessoa> pessoas, String curso) throws RemoteException;
	
	public  List<String> buscaPorCidade(List<Pessoa> pessoas, String cidade) throws RemoteException;
	
	public void adicionaExperienciaPorEmail(List<Pessoa> pessoas, String email, String experiencia)
			throws RemoteException;
}
