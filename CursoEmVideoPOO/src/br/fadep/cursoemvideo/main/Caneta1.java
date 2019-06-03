package br.fadep.cursoemvideo.main;

public class Caneta1 {
	public String modelo;
	private float ponta;
	
	public String getmodelo() {
		return modelo;
	}
	public void setCaneta(String modelo) {
		modelo = modelo;
	}
	public float getPonta() {
		return ponta;
	}
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	public void status() {
		System.out.println("A caneta!");
		System.out.println("Modelo: " +this.modelo);
		System.out.println("Ponta:" +this.ponta);
	}
		
}
