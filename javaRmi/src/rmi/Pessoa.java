package rmi;

import java.io.Serializable;

public class Pessoa implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8654312326031306248L;
	private String email;
	private String nome;
	private String sobreNome;
	private String residencia;
	private String formacaoAcademica;
	private String habilidades;
	private String expProf;
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public String getResidencia() {
		return residencia;
	}
	public void setResidencia(String residencia) {
		this.residencia = residencia;
	}
	public String getFormacaoAcademica() {
		return formacaoAcademica;
	}
	public void setFormacaoAcademica(String formacaoAcademica) {
		this.formacaoAcademica = formacaoAcademica;
	}
	public String getHabilidades() {
		return habilidades;
	}
	public void setHabilidades(String habilidades) {
		this.habilidades = habilidades;
	}
	public String getExpProf() {
		return expProf;
	}
	public void setExpProf(String expProf) {
		this.expProf = expProf;
	}
	
	public Pessoa(String email, String nome, String sobreNome, String residencia, String formacaoAcademica,
			String habilidades, String expProf) {
		super();
		this.email = email;
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.residencia = residencia;
		this.formacaoAcademica = formacaoAcademica;
		this.habilidades = habilidades;
		this.expProf = expProf;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Pessoa [email=" + email + ", nome=" + nome + ", sobreNome=" + sobreNome + ", residencia=" + residencia
				+ ", formacaoAcademica=" + formacaoAcademica + ", habilidades=" + habilidades + ", expProf=" + expProf
				+ "]";
	}
	
	
	
}
