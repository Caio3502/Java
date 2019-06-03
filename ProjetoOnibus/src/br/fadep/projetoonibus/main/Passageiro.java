package br.fadep.projetoonibus.main;

public class Passageiro {
	
	private String nome;
	private int idade;
	private boolean cartao = true;
	private double saldoCartao = 0;
	
	public double getSaldoCartao() {
		return saldoCartao;
	}
	public void setSaldoCartao(double saldoCartao) {
		this.saldoCartao = saldoCartao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public boolean isCartao() {
		return cartao;
	}
	public void setCartao(boolean cartao) {
		this.cartao = cartao;
	}
	
	public void pagar(double saldoCartao) {
		if(saldoCartao < 3.30) {
			System.out.println("Acesso Negado");
		}else {
			System.out.println("Acesso Permitido");
		}
	}
}
