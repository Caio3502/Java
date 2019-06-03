package br.fadep.prova.main;

public class Exercicio4 {
	public static void main(String[] args) {
		int [] Vetor = {-1, -10, -5, -11, -143, 10, 45, 34, 87, 31};
		int contador = 0;
		int contadorNegativo = 0;
			
		for(int i = 0; i < Vetor.length; i++) {
			if(Vetor[i] > 0) {
				contador++;
			}else {
				contadorNegativo++;
			}
		}
		System.out.println("A Quantidade de números Positivos é: " +contador);
		System.out.println("E a de números negativos é: " +contadorNegativo);
	}			
}

