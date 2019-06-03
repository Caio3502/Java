package br.fadep.polimorfismo.main;

public class Main {
	public static void main(String[] args) {
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		
		m.setPeso(35.5f);
		m.setCorDoPelo("Azul");
		m.setIdade(15);
		m.setMembros(4);
		//m.alimentar();
		//m.emitirSom();
		//m.locomover();
		
		Canguru c = new Canguru();
		Cachorro k = new Cachorro();
		Cobra o = new Cobra();
		Tartaruga t = new Tartaruga();
		Goldfish sh = new Goldfish();
		Arara ara = new Arara();
		
		c.locomover();
	}
}
