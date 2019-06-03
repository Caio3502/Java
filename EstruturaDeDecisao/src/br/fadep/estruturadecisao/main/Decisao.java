package br.fadep.estruturadecisao.main;

import java.util.Scanner;

public class Decisao {
	
	public static void main (String[]args) {
			
			//Para ler a entrada do usuario é necessario
			Scanner sc = new Scanner(System.in);
			System.out.println("Informe seu saldo: ");
			
			
			//O next  double() faz a leitura do que o usuario escreveu e converte para
			//double
			double saldo = sc.nextDouble();
			if (saldo < 0 ) {
				System.out.println("Saldo é negativo");
			} else {
				System.out.println("Saldo é positivo");
			}
		}
	}
