package br.fadep.trabalhoed2;

public class Produto {
	private String nome;
	private double preço;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + nome + "Preço: "  + preço;
	}
}