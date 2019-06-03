package br.fadep.porta.main;

import br.fadep.porta.main.Porta;

public class Main {
	public static void main(String[] args) {
		Porta porta = new Porta();
		porta.setCor("Azul");
		porta.setAberta(true);
		porta.setDimensaoX(1.50);
		porta.setDimensaoY(1.84);
		porta.setDimensaoZ(1.42);
		
		System.out.println("A Cor da porta é: " + porta.getCor());
		System.out.println("A porta está aberta: " + porta.isAberta());
		System.out.println("A Dimensão X é: " + porta.getDimensaoX());
		System.out.println("A dimensão Y é : "+ porta.getDimensaoY());
		System.out.println("A dimensão Z é : "+ porta.getDimensaoZ());
		
		porta.abre();
		porta.estaAberta();
	}
}
