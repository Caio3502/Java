package br.fadep.cursoemvideo.main;

public class Caneta {
	private String modelo;
	private String cor;
	private float ponta;
	private int carga;
	private boolean tampada;
	
	public  Caneta(String m, String c, float p) {
		this.modelo = m;
		this.cor = c;
		this.ponta =p;
	}				
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getPonta() {
		return ponta;
	}	
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	public int getCarga() {
		return carga;
	}
	public void setCarga(int carga) {
		this.carga = carga;
	}
	public boolean isTampada() {
		return tampada;
	}
	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}
	public void status() {
		System.out.println("Modelo:" + this.modelo);
		System.out.println("Cor:" + this.cor);
		System.out.println("Ponta:" + this.ponta);
		System.out.println("Carga:"+ this.carga);
		System.out.println("Tampada: "+this.tampada);
	}
	public void rabiscar() {
		if(tampada = true) {
			System.out.println("Erro, não posso rabiscar");
		}else {
			System.out.println("Estou pronto para rabiscar!");
		}
		
	}
	protected void tampar() {
		this.tampada = true;
	}
	protected void destampar() {
		this.tampada = false;
	}
}

