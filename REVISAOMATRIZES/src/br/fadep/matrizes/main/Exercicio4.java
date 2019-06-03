package br.fadep.matrizes.main;

public class Exercicio4 {
	public static void main(String[] args) {
		int[][] matriz = { {10120, 5, 2, 0}, {10121, 6, 2, 0}, {10122, 10, 1, 9}, {1023, 8, 2, 1},
			{10124, 9, 4, 0} };
		int notaFinal = 0;
		int matriculaMaiorNota = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length - 1; j++) {
				System.out.print("\t"+ matriz[i][j]);
			}
			System.out.println();
		
			}
		for (int i = 0; i < matriz.length; i++) {
			matriz[i][3] = matriz[i][1] + matriz[i][2];
			if (matriz[i][3] > notaFinal) {
				notaFinal = matriz[i][3];
				matriculaMaiorNota = matriz[i][0];
			}
		}
		System.out.println("A maior nota é: " + notaFinal + " do aluno da matricula " + matriculaMaiorNota);
		System.out.println();
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print("\t" + matriz[i][j]);
			}
			System.out.println();
			}
		}
	}


	