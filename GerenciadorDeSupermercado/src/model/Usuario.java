package model;

public class Usuario {

	private String nome, cpf;
	private boolean adm;
	public Usuario(String nome, String cpf, boolean adm) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.adm = adm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public boolean isAdm() {
		return adm;
	}
	public void setAdm(boolean adm) {
		this.adm = adm;
	}
	
	

}
