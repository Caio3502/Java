package br.fadep.pilha;

public class Fabrica {
	public String manufatura;

	public String getManufatura() {
		return manufatura;
	}

	public void setManufatura(String manufatura) {
		this.manufatura = manufatura;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + manufatura;
	}
}
