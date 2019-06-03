package br.fadep.youtube;

public class ListadeEpera {
	public static void main(String[] args) {
		Lista lista = new Lista();
		
		lista.inserir(1);
		lista.inserir(185);
		lista.inserir(431);
		
		lista.listar();
	}
}
