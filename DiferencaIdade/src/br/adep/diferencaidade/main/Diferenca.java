package br.adep.diferencaidade.main;

import java.util.Scanner;

public class Diferenca {
	public static void main(String[] args) {
		int idadefilho;
		int idademae;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Por favor informe a sua idade");
		idadefilho = leia.nextInt();
		System.out.println("Por favor informe a idade da sua m�e");
		idademae = leia.nextInt();
		
		 int resultadodiferenca = idademae - idadefilho;
		 
		 System.out.println("A difenre�a de idade entre voc� e sua m�e � de "+ resultadodiferenca);	
	}
}
