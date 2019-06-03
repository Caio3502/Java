package br.fadep.estruturadedados.main.teste;

import br.fadep.estruturadedados.main.Vetor;

public class Aula9 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(2);

		vetor.adiciona(1);
		vetor.adiciona(2);
		vetor.adiciona(3);
		vetor.adiciona(4);
		vetor.adiciona(5);
		vetor.adiciona(6);
		vetor.adiciona(7);
		
		vetor.remove(1);
		
		System.out.println(vetor);

	}

}
