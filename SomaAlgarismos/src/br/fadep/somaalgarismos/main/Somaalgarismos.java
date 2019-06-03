package br.fadep.somaalgarismos.main;

import java.util.Scanner;

public class Somaalgarismos {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um numero para somarmos o algarismos.");
		int num = leia.nextInt();
		int soma = 0;
		
		while(num > 0 ) {
			int modulo = num % 10;
			
			soma += modulo;
			num /= 10;
			
		}
		System.out.println(" A soma dos algarismos é " + soma );
		
	}

}
