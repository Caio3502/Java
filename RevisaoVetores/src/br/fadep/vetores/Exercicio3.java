package br.fadep.vetores;

import java.util.Scanner;

public class Exercicio3 {	
	
	public static void main(String[] args) {
		
		Scanner nota = new Scanner(System.in);
		
		double[] notaAluno = new double[10];
		
		double soma = 0;
		
		for(int i = 0; i < notaAluno.length; i++) {
			System.out.println("Informe a nota do Aluno: " + (i + 1));
			notaAluno[i] = nota.nextDouble();
			soma = soma + notaAluno[i];
			double resultado = soma / 10;
			
			System.out.println(resultado);
		}
			
		
		
	}
	
}
