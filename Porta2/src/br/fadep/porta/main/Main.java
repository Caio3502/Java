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
		
		System.out.println("A Cor da porta �: " + porta.getCor());
		System.out.println("A porta est� aberta: " + porta.isAberta());
		System.out.println("A Dimens�o X �: " + porta.getDimensaoX());
		System.out.println("A dimens�o Y � : "+ porta.getDimensaoY());
		System.out.println("A dimens�o Z � : "+ porta.getDimensaoZ());
		
		porta.abre();
		porta.estaAberta();
	}
}
