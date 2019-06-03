package br.fadep.pilha;

import java.util.LinkedList;
import java.util.List;

public class Pilha {
	
	private List<Fabrica> pilha = new LinkedList<Fabrica>();
	
	void insere(Fabrica fabrica) {
		this.pilha.add(fabrica);
	}
	
	Fabrica remove () {
		return this.pilha.remove(pilha.size()-1);
	}
	
	boolean vazia() {
		return this.pilha.size() == 0;
	}
	
	int tamanho() {
		return pilha.size();
	}
	public String toString() {
		if(this.pilha.isEmpty()) {
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder("[");
		builder.append("Pilha: ");
		for(int i = 0; i <pilha.size() -1; i++) {
			builder.append(this.pilha.get(i).getManufatura());
			builder.append(", ");
		}
		builder.append(this.pilha.get(tamanho() -1).getManufatura());
		builder.append("]");
		return builder.toString();
	}
}
