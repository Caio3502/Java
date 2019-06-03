package br.fadep.fila;


public class Executar {
	
	public static void main(String[] args) {
		Fila<Filme> fila = new Fila<Filme>();
		
		Filme filme = new Filme();
		filme.setNome("Morte");
		Filme filme1 = new Filme();
		filme1.setNome("It a coisa");
		
		fila.insere(filme);
		fila.insere(filme1);
		
		System.out.println(fila);
		
		Fila<String> filaString = new Fila<String>();
		filaString.insere("Maça");
		filaString.insere("Pera");
		filaString.insere("Melancia");
		
		
		System.out.println(filaString);
	}
}
