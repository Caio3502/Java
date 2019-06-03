package br.fadep.trabalhoed2;

import java.util.LinkedList;
import java.util.List;

public class Pilha {
	
	private List<Venda> pilha = new LinkedList<Venda>();
	
	void insere(Venda produto) {
		this.pilha.add(produto);
		}
	public Venda remove() {
			return pilha.remove(this.pilha.size() - 1);
	}
	
	public String toString() {
		if(this.pilha.isEmpty()) {
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder("[");
		builder.append("Pilha: ");
		for(int i = 0; i <pilha.size() -1; i++) {
			builder.append(this.pilha.get(i).getPessoa());
			builder.append(", ");
			builder.append(this.pilha.get(i).getProduto());
		}
		return builder.toString();
	}
}