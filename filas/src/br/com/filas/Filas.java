package br.com.filas;

import java.util.LinkedList;
import java.util.List;

public class Filas {
	
	private List<Filme> filmes = 
			new LinkedList<Filme>();
	
	public void insere(Filme filme) {
		this.filmes.add(filme);
	}
	
	public Filme pegar(int posicao) {
		return this.filmes.get(posicao);
	}
	
	public  String vazia() {
		if (filmes.size() != 0 ) {
			return "A Fila contem Filmes!!!";
		} else {
			return "A Fila esta Vazia";
		}
	}
	
	public int tamanho() {
		return filmes.size();
	}
	
	public String esvaziar() {
		filmes.clear();
		return "Lista Esvaziada";
	}
	

	@Override
	public String toString() {
		return "Fila [filmes=" + filmes + "]";
	}
	 
}