package br.fadep.classes2.main;

import br.fadep.classes2.models.Carro;

public class Main {
	public static void main(String[] args) {
		Carro carroNovo = new Carro();
		carroNovo.setCor= ("Azul");
		carroNovo.modelo = "Modelo";
		carroNovo.ano = 2015;
		carroNovo.velocidadeMaxima = 200;
		carroNovo.velocidadeAtual = 50;
	
		System.out.println("Novo carro criado!");
		System.out.println("Modelo: " + carroNovo.modelo);
		System.out.println("Ano: " + carroNovo.ano);
		System.out.println("Velocidade Máxima: " + carroNovo.velocidadeMaxima);
		System.out.println("Velocidade Atual: " + carroNovo.velocidadeAtual);
		
		carroNovo.ligar();
		carroNovo.acelerar(10);
		System.out.println("Velocidade Atual: " + carroNovo.velocidadeAtual);
		System.out.println("================================================");
	
		// ------------------------- Carro 2------------------------------
		Carro carroNovo2 = new Carro();
		carroNovo2.cor= "Roda";
		carroNovo2.modelo = "Gol";
		carroNovo2.ano = 2011;
		carroNovo2.velocidadeMaxima = 100;
		carroNovo2.velocidadeAtual = 60;
	
		System.out.println("Novo carro criado!");
		System.out.println("Modelo: " + carroNovo2.modelo);
		System.out.println("Ano: " + carroNovo2.ano);
		System.out.println("Velocidade Máxima: " + carroNovo2.velocidadeMaxima);
		System.out.println("Velocidade Atual: " + carroNovo2.velocidadeAtual);
		carroNovo2.ligar();
		carroNovo2.acelerar(40);
		
	}

}
