package br.fadep.calcularmedia.main;

import java.util.Scanner;

public class Calculandomedia {
	
	public static void main (String[] args) {
		
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		
		System.out.println("----------------------------");
		System.out.println("Sistema feito para calcular m�dia");
		System.out.println("----------------------------");
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe sua 1� Nota");
		nota1 = leia.nextDouble();
		
		System.out.println("Informe sua 2� Nota");
		nota2 = leia.nextDouble();
		
		System.out.println("Informe sua 3� Nota");
		nota3 = leia.nextDouble();
		
		System.out.println("Informe sua 4� Nota");
		nota4 = leia.nextDouble();
		
		double resultadomedia;
		
		resultadomedia = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (resultadomedia >= 7){
			System.out.println("Voc� est� aprovado!!! " +resultadomedia + "� sua m�dia!");
		}else {
			System.out.println("Voc� est� em recupera��o!!! " + resultadomedia +" � sua m�dia!");
			
		}
		
	}

}
