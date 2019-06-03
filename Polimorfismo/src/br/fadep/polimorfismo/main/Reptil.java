package br.fadep.polimorfismo.main;
		
public class Reptil   extends Animal{
	private String corScama;

	@Override
	public void locomover() {
		System.out.println("Rastejando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo Vegetais");
	}

	@Override
	public void emitirSom() {
		System.out.println("Gritando");
	}

	public String getCorScama() {
		return corScama;
	}

	public void setCorScama(String corScama) {
		this.corScama = corScama;
	}
	
}
