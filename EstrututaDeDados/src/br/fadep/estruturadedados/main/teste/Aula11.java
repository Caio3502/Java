package br.fadep.estruturadedados.main.teste;

import br.fadep.estruturadedados.main.teste.Lista;

public class Aula11 {
	public static void main(String[] args) {
		Lista<String> vetor = new Lista<String>(2);
		vetor.adiciona("Elemento");
		
		System.out.println("Elemento:" + vetor);
		
	}
}
