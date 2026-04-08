package model;

public class Usuario {

	private String nome, cpf;
	private boolean adm;
	private int id;
	public Usuario(String nome, String cpf, boolean adm, int id) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.adm = adm;
		this.id = id;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
