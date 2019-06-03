package br.fadep.main;

import br.fadep.objeto.IFiguraGeometrica;
import br.fadep.objeto.Quadrado;
import br.fadep.objeto.Triangulo;

public class Main {
	
	public static void main(String[] args) {
		Quadrado quadrado = new Quadrado();
		quadrado.setLado(2);
		int areaQuadrado = quadrado.getArea();
		System.out.println(areaQuadrado);
		
		
		Triangulo triangulo = new Triangulo();
		triangulo.setBase(1);
		triangulo.setAltura(3);
		triangulo.setLadoA(2);
		triangulo.setLadob(2);
		int areaTriangulo = triangulo.getArea();
		System.out.println(areaTriangulo);
		
		mostrarPerimetro(quadrado);
		mostrarPerimetro(triangulo);
		
	}
	public static void mostrarPerimetro (IFiguraGeometrica figura) {
		System.out.println("Perimetro do" + figura.getNomeFigura()
		+ ", é " + figura.getPerimetro());
	}
}
