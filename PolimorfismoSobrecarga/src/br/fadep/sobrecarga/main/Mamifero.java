package br.fadep.sobrecarga.main;

public class Mamifero extends Animal {
	protected String CorPelo;

	@Override
	public void emitirSom() {
		System.out.println("Som do mamifero");
	}
}
