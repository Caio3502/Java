package br.fadep.matrizes.main;

import java.util.Random;

public class Exercicio2 {
	public static void main(String[] args) {
		
		int matriz [][] = new int [3][3];
		Random numeroRandom = new Random();
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j]= numeroRandom.nextInt(50);
			}
		}		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = matriz[i][j] * matriz[i][j];
				System.out.print("\t" +matriz[i][j]);
			}
			System.out.println();
		}
	}
}
