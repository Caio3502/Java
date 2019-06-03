package br.fadep.carro;

public class Executar {

	public static void main(String[] args) {
		
		Carro novo = new Carro();
		novo.setNome("Uno");
		novo.setMarca("Fiat");
		novo.setAno(2014);
		
		Carro novo1 = new Carro();
		novo1.setNome("Fusion");
		novo1.setMarca("Fiat");
		novo1.setAno(2010);
		
		Carro novo2 = new Carro();
		novo2.setNome("Cobalt");
		novo2.setMarca("Fiat");
		novo2.setAno(2017);
		
		Carro novo3 = new Carro();
		novo3.setNome("HB20");
		novo3.setMarca("Ford");
		novo3.setAno(2020);
		
		Carro novo4 = new Carro();
		novo4.setNome("Jeep");
		novo4.setMarca("Ford");
		novo4.setAno(2010);
		
		Carro novo5 = new Carro();
		novo5.setNome("Gol");
		novo5.setMarca("Ford");
		novo5.setAno(2014);
		
		Fila fila = new Fila();
		fila.insere(novo1);
		fila.insere(novo2);
		fila.insere(novo3);
		fila.insere(novo4);
		fila.insere(novo5);
		fila.verificar();
		System.out.println(fila);
	}
}
