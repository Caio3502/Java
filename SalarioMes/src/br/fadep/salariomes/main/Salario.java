package br.fadep.salariomes.main;

import java.util.Scanner;


public class Salario {
	public static void main(String[] args) {
		
		double hora;
		double quantidadehora;
		
		
		Scanner leia = new Scanner (System.in);
		
		
		System.out.println("Digite A quantidade que Você ganha por Hora");
		hora = leia.nextDouble();
		System.out.println("Agora, a quantidade de horas trabalhadas no mês");
		quantidadehora = leia.nextDouble();
		
		double salario;
		
		salario = hora * quantidadehora;
		
		System.out.println("Seu salário neste mês referido será! " + salario);
	}
}
