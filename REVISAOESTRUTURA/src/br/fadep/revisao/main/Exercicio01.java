package br.fadep.revisao.main;

public class Exercicio01 {
	public static void main(String[] args) {
		double [] numerosReais = new double [10];
		numerosReais [0] = 30.0; 
		numerosReais [1] = 30.0;
		numerosReais [2] = 30.0;
		numerosReais [3] = 30.0;
		numerosReais [4] = 30.0;
		numerosReais [5] = 30.0;
		numerosReais [6] = 30.0;
		
		System.out.println("O valor da temperatura dia 1: " + numerosReais[1]);
		
		System.out.println("O tamanho do Vetor é" + numerosReais.length);
		
		for(int i = 0; i < numerosReais.length; i++) {
			System.out.println(numerosReais[i]);
		}
		
	}
}
