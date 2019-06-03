package br.fadep.carro;

import java.util.LinkedList;
import java.util.List;

public class Fila {

	private List<Carro> Carros =
			new LinkedList<Carro>();
	
	private List<Carro> CarrosFiat =
			new LinkedList<Carro>();
	
	private List<Carro> CarrosFord =
			new LinkedList<Carro>();
	
	
	public void insere(Carro carro) {
		this.Carros.add(carro);		
		
	}
	
	public int tamanho() {
		return this.Carros.size();
	}
	
	public Carro pegar(int posicao) {
		return this.Carros.get(posicao);
	}
	
	public void verificar() {
		for(int i = 0; i < this.tamanho(); i++) {
			Carro carroEncontrado = this.pegar(i);
			if (carroEncontrado.getMarca().equals("Fiat")){
				this.CarrosFiat.add(carroEncontrado);
			} else if (carroEncontrado.getMarca().equals("Ford")) {
				this.CarrosFord.add(carroEncontrado);
			}
		}
	}
	
	
	@Override
	public String toString() {
		return "Carros Fiat = " + CarrosFiat + "/n  " + "Carros Ford = " + CarrosFord;
	}
}
