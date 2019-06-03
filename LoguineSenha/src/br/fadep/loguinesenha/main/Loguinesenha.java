package br.fadep.loguinesenha.main;

import java.util.Scanner;

public class Loguinesenha {
	
	public static void main(String[] args) {
		String loguin = "Caio";
		String senha = "seubaitola456";
		
		Scanner ls = new Scanner(System.in);
		
		System.out.print("Informe seu loguin:");
		loguin = ls.next();
		
		System.out.print("Informe sua senha: ");
		senha = ls.next();
		
		if( loguin.equals ("Caio") && senha.equals ("seubaitola456")) {
			System.out.print("Sucesso");
			}else {
				System.out.print("Erro, tente novamente!");
			}
			
		
	}
}
