package br.fadep.variaveis.main;

public class Variaveis {
	public static void main (String[]args) {
		//Declarando uma variavel do tipo inteiro
		int numero = 0;
		// Uma variavel deve ser criada com um tipo de dado
		// e no decorer do uso da mesmo, esse tipo de dado não pode mudar
		//numero = '25' <- Errado, a variavel numero só pode receber
		//inteiros
		// int -> 4 bytes
		
		int numero2 = 5;
		int soma;
		
		soma = numero + numero2;
		System.out.println("A soma é: "+ soma);
		//Variavel do tipo double
		double nota = 8.5;
		
		System.out.println("A nota é: "+ nota);
		// Variavel do tipo Double
		double nota1 = 8.5;
		double nota2= 5;
		double nota3= 1.0;
		
		System.out.println(nota2);
		
		double resultado = (nota1 + nota2 + nota3) /4;
		
		System.out.println("Sua nota é: " + resultado);
		
		// long é um numero que ocupa mais bytes, consequentemente
		// esse tipo de dado pode suportar número inteiro maiores
		long numeromaior = 3;
		
		//Já o float é uma decimal menor que o double
		// float -> 4 bytes
		float decimalmaior = 3.9999f;
		
		// Veriavel de caracter, char -> 1 byte
		
		char caracter = 'c';
		
		// uma string é um array de caracteres, que no se tiop
		// prmitivo é declarado neste forma.
		char [] caracteres = new char [10];
		caracteres[0] = 'I';
		caracteres[1] = 'S';
		caracteres[2] = 'S';
		caracteres[3] = '0';
		caracteres[4] = 'O';
		
		// O java possui uma classe para trabalhanrmos com string
		String texto = " Isso é uma string: ";
		
		// Variavel booleana
		boolean =>
		boolean ehVerdade = true
	
		
	}
	
	
}
