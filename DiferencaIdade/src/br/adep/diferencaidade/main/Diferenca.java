package br.adep.diferencaidade.main;

import java.util.Scanner;

public class Diferenca {
	public static void main(String[] args) {
		int idadefilho;
		int idademae;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Por favor informe a sua idade");
		idadefilho = leia.nextInt();
		System.out.println("Por favor informe a idade da sua mãe");
		idademae = leia.nextInt();
		
		 int resultadodiferenca = idademae - idadefilho;
		 
		 System.out.println("A difenreça de idade entre você e sua mãe é de "+ resultadodiferenca);	
	}
}
