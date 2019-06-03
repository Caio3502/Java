package br.fadep.tags.main;

import java.util.Scanner;

public class Tags {
	public static void main(String[] args) {
		int idade;
		
		Scanner leia = new Scanner (System.in);
		System.out.println("Por favor, informe seu nome: ");
		String nome = leia.nextLine();
		
		System.out.println("Sua Cidade: ");
		String cidade = leia.nextLine();
		
		System.out.println("E por fim, sua idade");
		idade = leia.nextInt();
		
		System.out.println("Seu nome é, " + nome + " você mora em, " + cidade + " E tem " + idade + "Anos");
	}

}
