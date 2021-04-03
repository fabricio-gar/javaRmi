package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

import javax.swing.JOptionPane;

public class RmiClientStart {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		HelloService service = (HelloService) Naming.lookup("rmi://189.48.80.221:5099/hello");
		UtilsService utils = (UtilsService) Naming.lookup("rmi://189.48.80.221:5100/utils");
		System.out.println(service.echo("hey"));
		List<Pessoa> buscaPessoas = service.buscaPessoas();
		
		String[] opcoes = { "Buscar por curso", "Listar habilidade por Cidade", "Acrescentar experiência por email" };
		boolean fim = true;
		while (fim) {

			int x = JOptionPane.showOptionDialog(null, "Returns the position of your choice on the array",
					"Click a button", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes,
					opcoes[0]);
			System.out.println(x);

			switch (x) {
			case 0: {
				String curso = JOptionPane.showInputDialog("Qual curso?");
				utils.buscaPorCurso(buscaPessoas, curso);
				break;

			}
			case 1: {
				String cidade = JOptionPane.showInputDialog("Qual cidade?");
	
				JOptionPane.showMessageDialog(null, utils.buscaPorCidade(buscaPessoas, cidade));
				break;
			}
			case 2: {
				String email = JOptionPane
						.showInputDialog("Qual o Email da pesso que \n deseja acrescentar uma experiência?");
				String experiencia = JOptionPane
						.showInputDialog("Qual o Email da pesso que \n deseja acrescentar uma experiência?");
				utils.adicionaExperienciaPorEmail(buscaPessoas, email, experiencia);
				break;
			}
			default: {
				fim = false;
				break;
			}

			}

		}
	}

}
