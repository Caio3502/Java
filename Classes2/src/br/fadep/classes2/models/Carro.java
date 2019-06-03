package br.fadep.classes2.models;

public class Carro {
	// Atributos
	private String cor;
	private String modelo;
	private int ano;
	private double velocidadeMaxima;
	private double velocidadeAtual;
	
	public String getcor() {
		return this.cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	//Métodos

	public void ligar() {
		System.out.println("Carro foi ligado com sucesso ");	
	}
	public void acelerar(double quantidade) {
		double novaVelocidade = this.velocidadeAtual + quantidade;
		this.velocidadeAtual = novaVelocidade;
	}
	
}
