package com.fadep.listasencadeadas.main;

public class Produto {

	private String nome;
	private Produto proximo;
	
	
	public Produto(String nome, Produto proximo) {
		super();
		this.nome = nome;
		this.proximo = proximo;
	}
	
	public Produto(String nome) {
		super();
		this.nome = nome;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Produto getProximo() {
		return proximo;
	}
	public void setProximo(Produto proximo) {
		this.proximo = proximo;
	}
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", proximo=" + proximo + "]";
	}

	
}

