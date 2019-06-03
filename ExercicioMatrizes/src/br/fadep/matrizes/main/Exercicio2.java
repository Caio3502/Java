package br.fadep.matrizes.main;

import java.util.Random;

public class Exercicio2 {
	public static void main(String[] args) {
		int [][] matriz = new int [3][3];
		int [][] matriz1 = new int [3][3];
		Random numeroRandom =  new Random ();
		
		// Populando a matriz A
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = numeroRandom.nextInt(15);
			}
			
		}
	
		//Visualizando a matriz a 
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print("\t" + matriz[i][j]);
			}
			System.out.println();
		}
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz1[i][j] = matriz[i][j] * matriz[i][j];
			}
		}
		System.out.println();
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print("\t" + matriz1[i][j]);
			}
			System.out.println();
		}
	}
}
