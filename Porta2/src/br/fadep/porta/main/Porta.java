package br.fadep.porta.main;

public class Porta {
	private String Cor;
	private boolean Aberta;
	private double DimensaoX, DimensaoY, DimensaoZ;
	
	public String getCor() {
		return Cor;
	}
	public void setCor(String cor) {
		Cor = cor;
	}
	public boolean isAberta() {
		return Aberta;
	}
	public void setAberta(boolean aberta) {
		Aberta = aberta;
	}
	public double getDimensaoX() {
		return DimensaoX;
	}
	public void setDimensaoX(double dimensaoX) {
		this.DimensaoX = dimensaoX;
	}
	public double getDimensaoY() {
		return DimensaoY;
	}
	public void setDimensaoY(double dimensaoY) {
		this.DimensaoY = dimensaoY;
	}
	public double getDimensaoZ() {
		return DimensaoZ;
	}
	public void setDimensaoZ(double dimensaoZ) {
		this.DimensaoZ = dimensaoZ;
	}
	

	void abre() {
		if(this.Aberta == false) {
			this.Aberta = true;
		}
	}
	void fecha() {
		if(this.Aberta == true) {
			this.Aberta = false;
		}
	}
	void pintar(String Cor) {
		String cordaPorta = this.Cor = Cor;
		System.out.println("A cor da porta é: "+ cordaPorta);
	}
	void estaAberta() {
		if(this.Aberta == true) {
			System.out.println("A porta está aberta!");
		}else {
			System.out.println("A porta está fechada!");
		}
			
	}
}
