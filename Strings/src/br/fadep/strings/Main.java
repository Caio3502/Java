package br.fadep.strings;

public class Main {
	
	public static void main(String[] args) {
		
		outrasFuncoesString();
		
		/* == 
		
		int numeroInt = 5;
		int numeroInt2 = 5;
		double numero_doble = 5.0;
		float numero_float = 5F;
		char [] texto_char = new char[3];
		long numero_long = 5l;
		
		 .equals 
		
		Integer numeroInteger = 5;
		Integer numeroInteger2 = 5;
		Double numeroDouble = 5.0;
		float numeroFloat = 5l;
		String texto = "";
		Long numeroLong = 5l;
		
		*/
	}
	
	public static void comprarString() {
	String stringA = new String ("teste");
	String stringB = new String ("teste");
	
	if (stringA == stringB) {
		System.out.println("Objetos Iguais");
	}else {
		System.out.println("Objetos Diferentes");
	}
	if (stringA.equals(stringB)) {
		System.out.println("Conteúdos Iguais");
	}else {
		System.out.println("Conteúdos Diferentes");
		}
	}
	public static void outrasFuncoesString() {
		String frase = "A classe String conta também com um"
				+ "metoo split que divide a string em um array de string"
				+ "dado/n determinado critério";

		//     Quebrando uma string em partes
		String[] palavras = frase.split("");
		System.out.println(palavras.length);
		for (String palavra : palavras) {
			System.out.println(palavra);
			// Colocando os textos em caixa alta
			System.out.println(palavra.toUpperCase());
			//Colocando em caixa baixa
			System.out.println(palavra.toLowerCase());
			//Pegando o valor de uma posicao do texto
			System.out.println(palavra.charAt(0));
			//Pegando a posicao de uma letra no texto
			System.out.println(palavra.indexOf("u"));
			//Verificando se um texto está contido dentro do outro
			System.out.println(palavra.contentEquals("um"));
			System.out.println(palavra.contains("um"));
			// pedaço da string
			System.out.println(frase.substring(4, 10));
			System.out.println(frase.substring(frase.indexOf("s") + "String".length()));
			// contatenando duas string
			System.out.println(palavra.concat("asd"));
			
		};
	}
}
