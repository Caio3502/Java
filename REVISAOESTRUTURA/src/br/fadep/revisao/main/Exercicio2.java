package br.fadep.revisao.main;

public class Exercicio2 {
	public static void main(String[] args) {
		int [] Vetor = {1, 0, 5, -2, -5, 7};
		int soma = 0; 
		
		for(int i = 0; i < Vetor.length; i++) {
			soma = Vetor[0] + Vetor[1] + Vetor[5];
			System.out.println("O valor da posição " + (i+1) + " É: " + Vetor[i]);

		}
		System.out.println("A soma: " +soma);
	}
}

