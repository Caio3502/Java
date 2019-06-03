package br.fadep.matrizes.main;

import java.util.Random;

public class Exercicio1 {
	public static void main(String[] args) {
		int [][] matriz = new int [3][3];
		Random numeroRandom = new Random();
		int contador = 0;
		
		//Popular Matriz
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = numeroRandom.nextInt(20);
			}
		}
		//Visualizar Matriz
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print("\t" + matriz [i][j]);
			}
			System.out.println();
		}
		//Verificar se é maior que 10//
		for (int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++)
				if(matriz[i][j] > 10) {
					contador++;
				}
		}
		System.out.println("Na matriz contém " + contador + " Números maior que 10");
	}
				
}
