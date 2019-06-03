package br.fadep.intervalousuario.main;

import java.util.Scanner;

public class Usuario {
	public static void main(String[] args) {
		int soma = 0;

	
		
		Scanner intervalo = new Scanner(System.in);
		System.out.println("Favor informar de quanto irá começar o intervalo");
		int inicio = intervalo.nextInt();
		
		System.out.println("Favor informar até onde irá");
		int fim = intervalo.nextInt();
		
		while(inicio<fim) {
			soma = soma+inicio;
			System.out.println(soma);
			inicio++;
		}

	}
}
