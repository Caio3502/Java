package br.fadep.revisao.main;

public class Exercicio5 {
	public static void main(String[] args) {
		int[] Vetor = {1,-14, -12, 40, 30, 21, 45, 21, 63, 21, 5, 74};
		int maiorValor= 0;
		int menorValor= 0;
	
		for(int i = 0; i < Vetor.length; i++) {
			if(Vetor[i] > maiorValor) {
				maiorValor = Vetor[i];
			}
			
		}
		System.out.println(maiorValor);
		for(int i = 0; i < Vetor.length; i++) {
			if(Vetor[i] < menorValor) {
				menorValor = Vetor[i];
			}
		}
		System.out.println(menorValor);
	}
}