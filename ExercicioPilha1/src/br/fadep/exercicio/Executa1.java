package br.fadep.exercicio;

public class Executa1 {
	public static void main(String[] args) {
		
	Exercicio1 pilha = new Exercicio1 ();
	
	if (pilha.pilhavazia()) {
		pilha.criapilha();
		for (int i = 0; i < pilha.tamanho(); i++) {
			pilha.empilha(i + 1);
		}
	}
	System.out.println(pilha);
	
	while (!pilha.pilhavazia()) {
		pilha.desempilha();
		}
	}
}
