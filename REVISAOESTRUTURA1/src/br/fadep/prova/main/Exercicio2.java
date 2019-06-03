package br.fadep.prova.main;

public class Exercicio2 {
	public static void main(String[] args) {
		int [] Vetor = {1,2,3,4,5,6};
		
		System.out.printf("[");
		for(int i = (Vetor.length -1); i >= 0; i--){
			System.out.print(" " +Vetor[i]);
		}
		System.out.println("  ]");
	}
}
