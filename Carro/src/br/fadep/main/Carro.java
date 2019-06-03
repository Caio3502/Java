package br.fadep.main;

public class Carro {
	private String nome;
	private int ano;
	private Carro proximo;
	
	
	public Carro(String nome, int ano, Carro proximo) {
		super();
		this.nome = nome;
		this.ano = ano;
		this.proximo = proximo;
	}


	public Carro(String nome, int ano) {
		super();
		this.nome = nome;
		this.ano = ano;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}


	public Carro getProximo() {
		return proximo;
	}


	public void setProximo(Carro proximo) {
		this.proximo = proximo;
	}
	
	public String toString() {
		return "Produto [nome:" + nome + "Ano:" + ano +", proximo:" + proximo + "]";
	}
}