package br.fadep.salariomes.main;

import java.util.Scanner;


public class Salario {
	public static void main(String[] args) {
		
		double hora;
		double quantidadehora;
		
		
		Scanner leia = new Scanner (System.in);
		
		
		System.out.println("Digite A quantidade que Voc� ganha por Hora");
		hora = leia.nextDouble();
		System.out.println("Agora, a quantidade de horas trabalhadas no m�s");
		quantidadehora = leia.nextDouble();
		
		double salario;
		
		salario = hora * quantidadehora;
		
		System.out.println("Seu sal�rio neste m�s referido ser�! " + salario);
	}
}
