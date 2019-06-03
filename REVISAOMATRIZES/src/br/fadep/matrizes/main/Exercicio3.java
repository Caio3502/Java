package br.fadep.matrizes.main;

public class Exercicio3 {
	public static void main(String[] args) {
		int [][] matriz = new int[5][5];
		
		for(int i =0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(i == j) {
					matriz[i][j] = 1;
				}else {
					matriz[i][j] = 0;
				}
			}
		}
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print("\t" + matriz[i][j]);
			}
			System.out.println();
		}
	}
}
