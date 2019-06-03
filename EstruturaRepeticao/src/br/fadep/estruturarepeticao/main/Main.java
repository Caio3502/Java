package br.fadep.estruturarepeticao.main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
//			for (variavel) de inicio do for;
//			até onde o for deve ir;
//			de quanto em quanto deve incrementar a variavel
//			
		System.out.println(i);
		}
		
		int j = 0;
		while (j < 5) {
			System.out.println(j);
			j++;
		}
		// Fazendo uma tabuada
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual tabuada deseja ? ");
		int tabuada = sc.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(tabuada + " x " +i + " = "+ tabuada * i);
		}
		System.out.println("Qual tabuada deseja ? ");
		int tab = sc.nextInt();
		
		for (int i = 10; i >= 0; i--) {
			System.out.println(tab + " x " +i + " = "+ tabuada * i);
		}
		
				
	}
}
