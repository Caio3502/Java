package br.fadep.resultadotrimestre.main;

import java.text.DecimalFormat;

public class Resultado {
	
	public static void main (String[]args) {
	
		float janeiro = 15000f;
		float fevereiro = 23000f;
		float marco = 17000f;
		float resultado;
		
		resultado = janeiro + fevereiro + marco;
		
		//Formatando o valor decimal 
		
		DecimalFormat format = new DecimalFormat ("#,##0.00");
		
		String valorFormatado = format.format(resultado);
		
		System.out.println("Seu resultado é " + valorFormatado);
	}
	
	
	
}
