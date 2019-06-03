package br.fadep.estruturadedados.main.teste;

import br.fadep.estruturadedados.main.Vetor;

public class Aula7 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(10);
		
		vetor.adiciona(1);
		vetor.adiciona(2);
		vetor.adiciona(3);
		
		System.out.println(vetor);
		
		vetor.adiciona(0, 4);
		
		System.out.println(vetor);
	}

}
