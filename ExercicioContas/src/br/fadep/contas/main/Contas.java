package br.fadep.contas.main;

import java.util.Scanner;

public class Contas {
	
	public static void main(String[] args) {
		double numero;
		double numero1;
		
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Informe um n�mero");
		numero = leia.nextDouble();
		
		System.out.println("Me diga s� mais um n�mero");
		numero1 = leia.nextDouble();
		
		double resultadosoma;
		double resultadosubtracao;
		double resultadomultiplicacao;
		double resultadodivisao;
		
		resultadosoma = numero + numero1;
		resultadosubtracao = numero - numero1;
		resultadomultiplicacao = numero * numero1;
		resultadodivisao = numero / numero1;
		
		System.out.println("A soma do seu n�mero �: "+ resultadosoma);
		System.out.println("A Subtra��o do seu n�mero �: "+ resultadosubtracao);
		System.out.println("A multiplicacao da sua opera��o �: "+ resultadomultiplicacao);
		System.out.println("A divis�o da sua conta �: "+ resultadodivisao);
				
	}

}
