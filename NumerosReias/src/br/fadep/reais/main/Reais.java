package br.fadep.reais.main;

import java.util.Scanner;

public class Reais {
	public static void main(String[] args) {
		int inte1;
		int inte2;
		double real;
		
		Scanner leia = new Scanner (System.in);
		System.out.println("Insira um Número: ");
		inte1 = leia.nextInt();
		System.out.println("Seu Segundo Número: ");
		inte2 = leia.nextInt();
		System.out.println("Agora um Número real, (Se preferir): ");
		real = leia.nextDouble();
		
		int resultado1;
		double resultado2;
		double resultado3;
		
		resultado1 = (inte1 * 2) + (inte2 / 2);	
		System.out.println(" O dobro do primeiro número com a metado do segundo "
				+ "ficará: " + resultado1);
		
		resultado2 = (inte1 * 3) + real;
		System.out.println("O triplo do primeiro com o número terceiro ficará: "+ resultado2);
		
		resultado3 = Math.pow(real, 3);
		System.out.println("O terceiro Número elevado ao cubo ficará!" + resultado3);
	
	}
}	
