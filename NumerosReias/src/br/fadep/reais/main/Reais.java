package br.fadep.reais.main;

import java.util.Scanner;

public class Reais {
	public static void main(String[] args) {
		int inte1;
		int inte2;
		double real;
		
		Scanner leia = new Scanner (System.in);
		System.out.println("Insira um N�mero: ");
		inte1 = leia.nextInt();
		System.out.println("Seu Segundo N�mero: ");
		inte2 = leia.nextInt();
		System.out.println("Agora um N�mero real, (Se preferir): ");
		real = leia.nextDouble();
		
		int resultado1;
		double resultado2;
		double resultado3;
		
		resultado1 = (inte1 * 2) + (inte2 / 2);	
		System.out.println(" O dobro do primeiro n�mero com a metado do segundo "
				+ "ficar�: " + resultado1);
		
		resultado2 = (inte1 * 3) + real;
		System.out.println("O triplo do primeiro com o n�mero terceiro ficar�: "+ resultado2);
		
		resultado3 = Math.pow(real, 3);
		System.out.println("O terceiro N�mero elevado ao cubo ficar�!" + resultado3);
	
	}
}	
