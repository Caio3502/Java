package br.fadep.matrizes.main;

import java.util.Random;

public class Exercicio1 {
	public static void main(String[] args) {
		
		int [][] matriz = new int [4][4];
		Random numeroRandom = new Random ();
		int contador = 0;
		
		//Popular Matriz
		for(int i=0; i < matriz.length; i++ ) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz [i][j] = numeroRandom.nextInt(30);
				

			}
		}
		for(int i=0; i < matriz.length; i++ ) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print("\t" + matriz[i][j]);
				contador++;
			}
			
		System.out.println();
		}
		System.out.println(" Na matriz A contem " + contador + " Números maiores que 10");
	}
}
