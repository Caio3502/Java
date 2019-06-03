package br.fadep.converter.main;

import java.util.Scanner;

public class Conversao {
	public static void main(String[] args) {
		
		int conversao;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Converão de metros para centimetro,"
				+ "Informe o valor para ser convertido: ");
		
		conversao = leia.nextInt();
		
		int resultado;
		
		resultado = conversao * 100;
		
		System.out.println("Seu resultado é: " + resultado);
	}
}
