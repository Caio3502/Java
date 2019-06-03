package br.fadep.objeto;

public class Triangulo implements IFiguraGeometrica{
	
	private int base;
	private int altura;
	private int ladoA;
	private int ladoB;
	private int ladoc;
	
	
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getLadoA() {
		return ladoA;
	}
	public void setLadoA(int ladoA) {
		this.ladoA = ladoA;
	}
	public int getLadob() {
		return ladoB;
	}
	public void setLadob(int ladoB) {
		this.ladoB = ladoB;
	}
	public int getLadoc() {
		return ladoc;
	}
	public void setLadoc(int ladoc) {
		this.ladoc = ladoc;
	}
	@Override
	public String getNomeFigura() {
		// TODO Auto-generated method stub
		return "Triângulo";
	}
	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		int area = (base * altura) / 2;
		return area;
	}
	@Override
	public int getPerimetro() {
		// TODO Auto-generated method stu
		int perimetro = ladoA + ladoB + base;
		return perimetro;
	}
	

}
