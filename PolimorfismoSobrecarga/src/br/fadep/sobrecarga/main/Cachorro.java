package br.fadep.sobrecarga.main;

public class Cachorro extends Lobo {
	public void emitirSom() {
		System.out.println("Au!, Au!, Au!");
	}
	public void reagir(String frase) {
		if(frase.equals("Oi")) {
			System.out.println("Abanar e Latir");
		}else {
			System.out.println("Rosnar");
		}
	}
}
