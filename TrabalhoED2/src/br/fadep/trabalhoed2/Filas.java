package br.fadep.trabalhoed2;

import java.util.LinkedList;
import java.util.List;



public class Filas {
	
	private List<Pessoa> pessoas =
			new LinkedList<Pessoa>();
	
	private List<Produto> produtos = 
			new LinkedList<Produto>();
	
	public void insere(Produto produto) {
		this.produtos.add(produto);
	}
	
	public void insere(Pessoa pessoa) {
		this.pessoas.add(pessoa);
	}
	
	public Pessoa remove() {
		return this.pessoas.remove(1);
	}
	
	@Override
	public String toString() {
		return "Fila [Pessoas=" + pessoas + "]";
	}
	
	public String toString1() {
		return "Fila [Produtos=" + produtos + "]";
	}
}
