package br.fadep.fila;

import java.util.LinkedList;
import java.util.List;

public class Fila<T> {

	List<T> objetos = new LinkedList<T>();
	
	void insere(T t) {
		this.objetos.add(t);
	}
	T remove() {
		return this.objetos.remove(0);
	}
	boolean vazia() {
		return this.objetos.size() == 0;
	}
	int tamanho() {
		return this.objetos.size();
	}
	public String toString() {
		if(this.objetos.isEmpty()) {
			return "[]";
		}
	
	StringBuilder builder = new StringBuilder("[");
	builder.append("Lista: ");
	for(int i = 0; i < this.objetos.size() -1; i++) {
		builder.append(this.objetos.get(i));
		builder.append(", ");
	}
	builder.append(this.objetos.get(tamanho() -1));
	builder.append("]");
	return builder.toString();
	}
}