package br.fadep.numerosprimos.main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Numero classeNumero = new Numero ();
		
		System.out.println("Informe um n�mero: ");
		int numeroInformado = sc.nextInt();
		
		boolean primo = classeNumero.ehPrimo(numeroInformado);
		
		if(primo) {
			System.out.println("O n�mero � primo");
			
		}else
			System.out.println("O n�mero n�o � primo");
	}
}
