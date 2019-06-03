package br.fadep.areaquadrado.main;

import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Vamos calcular a área do quadrado e dobrar esse valor, "
				+ "Digite o valor de um lado: ");
		double area = leia.nextDouble();
		
		double resultado;
		
		resultado = (area * 4) * 2;
		
		System.out.println("O resultado será: "+ resultado);
	}
}
