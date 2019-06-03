package br.fadep.carro;

public class Carro {

	private String nome;
	private String marca;
	private int ano;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	@Override
	public String toString() {
		return "[Nome = " + nome + "Marca = " + marca + "Ano = " + ano +"]";
	}
}
