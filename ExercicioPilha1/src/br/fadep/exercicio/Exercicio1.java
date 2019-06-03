package br.fadep.exercicio;

public class Exercicio1 {

	private int n = 10;  
	private int[] pilha = new int[n];
	private int tamanho;

	void criapilha() {
		tamanho = 0;
	}
	void empilha(int y) {
		pilha[tamanho++] = y;
	}
	int desempilha() {
		return pilha[--tamanho];
	}
	boolean pilhavazia() {
		return tamanho <= 0;
	}
	boolean pilhacheia() {
		return tamanho > n;
	}
	int tamanho() {
		return n;
	}
	public String toString() {
		if (this.pilhavazia()) {
			return "[]";
		}
		StringBuilder builder = new StringBuilder("[");
		
		builder.append("Lista de números:  ");
		for (int i = 0; i < this.tamanho() - 1 ; i++) {
			builder.append(this.pilha[i]);
			builder.append(", ");
		}	
		builder.append(this.pilha[this.tamanho() - 1]);
		builder.append("]");
		return builder.toString();
	}
}