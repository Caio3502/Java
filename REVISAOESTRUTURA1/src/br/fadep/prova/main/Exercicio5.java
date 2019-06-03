package br.fadep.prova.main;

import java.util.Random;

public class Exercicio5 {
	public static void main(String[] args) {
		int repetido = 0;
		int contarRepetidos =0;
		
		int[] VetorA = new int [15];
		int[] VetorB = new int [VetorA.length];
		
		for(int i = 0; i < VetorA.length; i++) {
			Random numeroRandom = new Random();
			VetorA[i] = numeroRandom.nextInt();
		}
		for(int i = 0; i < VetorA.length; i++) {
			for(int j = 0; j < VetorA.length; j++) {
				if(VetorA[i] != repetido) {
					repetido += VetorA[i];
				}else {
					contarRepetidos++;
				}
			}
		}
		System.out.println("Repetidos: " + repetido);
		System.out.println("Contar Repetidos: " + contarRepetidos);
	}		
}
