package br.fadep.objeto;

public class Quadrado implements IFiguraGeometrica {
	
	private int lado;

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public String getNomeFigura() {
		// TODO Auto-generated method stub
		return "Quadrado";
	}

	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		int area = this.lado * this.lado;
		return area;
	}

	@Override
	public int getPerimetro() {
		// TODO Auto-generated method stub
		int perimetro = this.lado * 4;
		return perimetro;
	}

}
