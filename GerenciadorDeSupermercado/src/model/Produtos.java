package model;

public class Produtos {
	private	String nome;
	private int qtd, etoque;
	public Produtos(String nome, int qtd, int etoque) {
		super();
		this.nome = nome;
		this.qtd = qtd;
		this.etoque = etoque;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public int getEtoque() {
		return etoque;
	}
	public void setEtoque(int etoque) {
		this.etoque = etoque;
	}
	
	
}
