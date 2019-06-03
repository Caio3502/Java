package br.fadep.contas.main;

import java.util.Scanner;

public class Contas {
	
	public static void main(String[] args) {
		double numero;
		double numero1;
		
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Informe um número");
		numero = leia.nextDouble();
		
		System.out.println("Me diga só mais um número");
		numero1 = leia.nextDouble();
		
		double resultadosoma;
		double resultadosubtracao;
		double resultadomultiplicacao;
		double resultadodivisao;
		
		resultadosoma = numero + numero1;
		resultadosubtracao = numero - numero1;
		resultadomultiplicacao = numero * numero1;
		resultadodivisao = numero / numero1;
		
		System.out.println("A soma do seu número é: "+ resultadosoma);
		System.out.println("A Subtração do seu número é: "+ resultadosubtracao);
		System.out.println("A multiplicacao da sua operação é: "+ resultadomultiplicacao);
		System.out.println("A divisão da sua conta é: "+ resultadodivisao);
				
	}

}
