package br.fadep.intervalousuario.main;

import java.util.Scanner;

public class Usuario {
	public static void main(String[] args) {
		int soma = 0;

	
		
		Scanner intervalo = new Scanner(System.in);
		System.out.println("Favor informar de quanto ir� come�ar o intervalo");
		int inicio = intervalo.nextInt();
		
		System.out.println("Favor informar at� onde ir�");
		int fim = intervalo.nextInt();
		
		while(inicio<fim) {
			soma = soma+inicio;
			System.out.println(soma);
			inicio++;
		}

	}
}
