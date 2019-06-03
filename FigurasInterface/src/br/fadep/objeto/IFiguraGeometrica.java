package br.fadep.objeto;

public interface IFiguraGeometrica {
	
	/* Em uma interface declaramos os cabecalhos
	 * dos métodos que devem ser implementados nas classes em que 
	 * essa interface será declarada. */
	
	public String getNomeFigura();
	public int getArea();
	public int getPerimetro();
}
