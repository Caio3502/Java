package br.fadep.calcularmedia.main;

import java.util.Scanner;

public class Calculandomedia {
	
	public static void main (String[] args) {
		
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		
		System.out.println("----------------------------");
		System.out.println("Sistema feito para calcular média");
		System.out.println("----------------------------");
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe sua 1º Nota");
		nota1 = leia.nextDouble();
		
		System.out.println("Informe sua 2º Nota");
		nota2 = leia.nextDouble();
		
		System.out.println("Informe sua 3º Nota");
		nota3 = leia.nextDouble();
		
		System.out.println("Informe sua 4º Nota");
		nota4 = leia.nextDouble();
		
		double resultadomedia;
		
		resultadomedia = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (resultadomedia >= 7){
			System.out.println("Você está aprovado!!! " +resultadomedia + "É sua média!");
		}else {
			System.out.println("Você está em recuperação!!! " + resultadomedia +" É sua média!");
			
		}
		
	}

}
