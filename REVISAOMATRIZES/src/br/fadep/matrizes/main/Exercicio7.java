package br.fadep.matrizes.main;

public class Exercicio7 {
	public static void main(String[] args) {
		int[][] matriz = { {1,2,3}, {4, 5, 6}, {7, 8, 9} };
		int soma = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("\t" + matriz[i][j]);
			}
			System.out.println();
		}
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz.length; j++) {
				if(i >= j) {
					continue;										
				}					
				
				
				soma += matriz[i][j];							
			}			
		}
		System.out.println("Soma dos elementos acima da Diagonal Principal é: " + soma);
	}

}

