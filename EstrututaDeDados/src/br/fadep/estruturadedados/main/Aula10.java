package br.fadep.estruturadedados.main;

import br.fadep.estruturadedados.main.VetorObjeto;

public class Aula10 {
	public static void main(String[] args) {
		VetorObjeto vetor = new VetorObjeto(3);
		
		vetor.adiciona(3);
		vetor.adiciona(4);
		vetor.adiciona(5);
		
		System.out.println("Tamanho: " + vetor.tamanho());
		
		System.out.println(vetor);
		
	}
}
