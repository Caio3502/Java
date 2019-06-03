package br.fadep.polimorfismo.main;

public class Peixe extends Animal {
	private String corScama;

	@Override
	public void locomover() {
		System.out.println("Nadando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo substâncias");
	}

	@Override
	public void emitirSom() {
		System.out.println("Qual peixe?");
	}
	public void soltarBolha() {
		System.out.println("Soltando Bolha");
	}

	public String getCorScama() {
		return corScama;
	}

	public void setCorScama(String corScama) {
		this.corScama = corScama;
	}
		
}
