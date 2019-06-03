package br.fadep.transformacao.main;

import java.util.Scanner;

public class Transformacao {
	public static void main(String[] args) {
		
		int valor;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite os graus Fahrenheit para transformarmos em "
				+ "Celcius");
		valor = leia.nextInt();
		// C = (5 * (F-32) / 9).
		
		int Celcius = (5 * (valor - 32 )/9);
		
		System.out.println("Em Celcius ficaria: " + Celcius);
	}
}
