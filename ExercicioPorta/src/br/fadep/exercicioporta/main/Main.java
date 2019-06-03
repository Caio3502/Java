package br.fadep.exercicioporta.main;

import br.fadep.exercicioporta.main.Porta;

public class Main {
	public static void main(String[] args) {
		Porta porta = new Porta();
		porta.setCor("Azul");
		porta.setAberta(true);
		porta.setDimensaoX(1.50);
		porta.setDimensaoY(1.84);
		porta.setDimensaoZ(1.42);
		
		System.out.print("A Cor da porta é: " + porta.getCor());	
	}

}
