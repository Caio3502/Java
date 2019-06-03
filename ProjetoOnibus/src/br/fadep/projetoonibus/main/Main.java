package br.fadep.projetoonibus.main;

import br.fadep.projetoonibus.main.Passageiro;

public class Main {
	public static void main(String[] args) {
		Passageiro passageiro = new Passageiro();
		passageiro.setNome("Caio");
		passageiro.setIdade(18);
		passageiro.setCartao(false);
		
		System.out.println("Nome: "+ passageiro.getNome() + " Idade: " + passageiro.getIdade() + " Cartão: " + passageiro.isCartao());
		
	}
	
	
}
