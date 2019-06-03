package br.fadep.estruturadedados.main.teste;

import br.fadep.estruturadedados.main.Vetor;

public class Aula4 {
	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);
		
		
		vetor.adiciona(0);
		vetor.adiciona(1);
		vetor.adiciona(3);
		
		System.out.println(vetor.tamanho());
		
		System.out.println(vetor);
	}
	
}
