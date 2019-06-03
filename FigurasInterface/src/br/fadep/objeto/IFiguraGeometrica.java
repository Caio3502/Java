package br.fadep.objeto;

public interface IFiguraGeometrica {
	
	/* Em uma interface declaramos os cabecalhos
	 * dos m�todos que devem ser implementados nas classes em que 
	 * essa interface ser� declarada. */
	
	public String getNomeFigura();
	public int getArea();
	public int getPerimetro();
}
