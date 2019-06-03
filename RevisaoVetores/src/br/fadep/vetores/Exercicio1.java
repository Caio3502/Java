package br.fadep.vetores;

public class Exercicio1 {
	public static void main(String[] args) {
		
		int [] vetorA = {89, 10, 30, 40, 11, 40, 54};
		
		int maiorValor = Integer.MIN_VALUE;
		int menorValor = Integer.MAX_VALUE;
		int posicaoMaiorValor = 0;
		int posicaoMenorValor = 0;
		
		for(int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] > maiorValor) {
				maiorValor = vetorA[i];
				posicaoMaiorValor = vetorA[i];
			}	
		}
		System.out.println(maiorValor);
		
		for(int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] < menorValor) {
				menorValor = vetorA[i];
				posicaoMenorValor = vetorA[i];
			}
		}
		System.out.println(menorValor);
	}
}