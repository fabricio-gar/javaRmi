package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;


public class UtilsServant extends UnicastRemoteObject  implements UtilsService{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2239746647457226721L;

	public UtilsServant() throws RemoteException {
		super();
	}
	
	public void buscaPorCurso(List<Pessoa> pessoas, String curso) {
		
		pessoas.stream().filter(item-> item.getFormacaoAcademica().equals(curso))
				.forEach(item->System.out.println(item.getNome()+"| Email: "+item.getEmail()));
		
	}
	
	public  List<String> buscaPorCidade(List<Pessoa> pessoas, String cidade) {
		List<String> retorno =  new ArrayList<>();
		pessoas.stream().filter(item-> item.getResidencia().equals(cidade))
		.forEach(item->retorno.add(item.getHabilidades()+"| Email: "+item.getEmail()));
		return retorno;
	}
	
	public  void adicionaExperienciaPorEmail(List<Pessoa> pessoas, String email, String experiencia) {
		Pessoa findFirst = pessoas.stream().filter(item-> item.getEmail().equals(email)).findFirst()
				.orElse(null);
		if(findFirst==null) return;
		findFirst.setExpProf(findFirst.getExpProf()+"; "+experiencia);
		
		
	}
}
