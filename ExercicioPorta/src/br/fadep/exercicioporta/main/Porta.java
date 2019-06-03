package br.fadep.exercicioporta.main;

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
	

}
