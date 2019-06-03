package br.fadep.antecessor.main;

import java.util.Scanner;

public class Antecessor {
	
	public static void main(String[]args) {
		
		double numero;
		double antecessor;
		double sucessor;
		
		Scanner leia = new Scanner(System.in);
			
		System.out.println("Informe um número");
		numero = leia.nextDouble();
		
		antecessor = numero - 1;
		sucessor = numero + 1;
		
		System.out.println("O antecessor do seu número é: "+antecessor);
		System.out.println("O sucessor do seu número é: "+sucessor);
		
	}

}
