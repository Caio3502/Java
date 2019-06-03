package br.fadep.somaalgarismos.main;

import java.util.Scanner;

public class Somaalgarismoum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe qualquer número: ");
		String numero = sc.nextLine();
		
		char[] caracteres = numero.toCharArray();
		
		int soma = 0;
		for (int i = 0; i < caracteres.length; i++) {
			soma +=Character.getNumericValue(caracteres[i]);
			soma += Integer.parseInt(caracteres[i] + "");
		}
		System.out.println("A soma é: " +soma);
	}		
}
