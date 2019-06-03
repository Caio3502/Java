package br.fadep.trabalho.caio.main;

import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;

public class Metodos {

	public void Equacao(double a, double b, double c) {
		double xl = (-b + (Math.pow(b, 2) - (4*a*c)))/(2*a);
		double xll = (-b + (Math.pow(b, 2) + (4*a*c)))/(2*a);
		double resultado[] = new double[2];
		resultado[0] = xl;
		resultado[1] = xll;
		System.out.println(resultado);
	}
	public void comprarProduto (String produto ) {
		System.out.println("Produto, " + produto + "Comprado com sucesso");
	}
	
	public double retornarDiferença(Date data1, Date data2) {
		double result = 0;
		long diferenca = data1.getTime() - data2.getTime();
		double diferencaEmdias = (diferenca/ 1000) / 60 / 60 / 24;
		result = diferencaEmdias;
		return result;
	}
	public void acessoPermitido() {
		System.out.println("Acesso Permitido!");
	}
	public void retornarNumero(int numero) {
		if(numero > 0) {
			System.out.println("O Número é Positivo!");
		}else if(numero < 0 ) {
			System.out.println("O Número é Negativo");
		}else {
			System.out.println("O Número é 0");
		}
		
	}
	public void reservaLivro (String nomeLivro, String NomeLocador) {
		System.out.println("Livro Locado com sucesso");
	}
	public void retornarCaracteres(String texto) {
		int numeroLetra = 0;
		for(int i = 0; i < texto.length(); i++) {
			if(Character.isLetter(texto.charAt(i))) {
				numeroLetra++;
			}
		}
	
	}
	public void verificarNota() {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe o número da nota: ");
		int numeroNota = leia.nextInt();
		
		if(numeroNota > 0) {
			System.out.println("Nota recebida com sucesso");
		}else if(numeroNota < 0 ) {
			System.out.println("Nota não recebida");
		}else {
			System.out.println("A nota está sendo enviada!");
		}
		
		
	}
	
			
		public void agregaValor(double valor) {
			double valorTotal = 100;
			valorTotal +=valor;
			System.out.println("Novo valor: "+valorTotal);
		}
	
	
	public void compararPlavras(String palavra1, String palavra2) {
		if(palavra1.length() == palavra2.length()) {
			System.out.println("As palavras tem o mesmo tamanho!");
		}else {
			System.out.println("Não são iguais!");
		}
	}
}
