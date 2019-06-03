package br.fadep.calculararea.main;

import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		
		double raio;
		double area;
		
		final double pi = 3.1416;
		Scanner leia =  new Scanner (System.in);
		
		System.out.println("Vamo calcular a Área!, "
				+ "Escreve o valor do raio: ");
		raio = leia.nextDouble();
		
			
		area = pi* (raio * raio);
		
		System.out.println("A área é: " + area);
	}
}
