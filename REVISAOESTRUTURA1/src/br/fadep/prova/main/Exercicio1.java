package br.fadep.prova.main;

import java.util.Random;

public class Exercicio1 {
	public static void main(String[] args) {
		int [] vetor = new int [7];
		
		int maiorValor = Integer.MAX_VALUE;
		int menorValor = Integer.MIN_VALUE;
		int resultadoFinalM = 0;
		int resultadoFinalN = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			Random numeroRandom = new Random();
			vetor[i] = numeroRandom.nextInt(20);
			
		}
		for (int j = 0; j < vetor.length; j++) {
			if(vetor[j] > maiorValor) {
				maiorValor = vetor[j];
				resultadoFinalM = j;
			}
		}
		for(int k = 0; k < vetor.length; k++)
			if(vetor[k] < menorValor) {
				menorValor = vetor[k];
				resultadoFinalN = k;
			}
		System.out.println("Maior Valor:" + maiorValor);
		System.out.println("Menor Valor:" + menorValor);
	}
}
