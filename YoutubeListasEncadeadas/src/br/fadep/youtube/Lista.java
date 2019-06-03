package br.fadep.youtube;

public class Lista {
	
	private Caixinha inicio;
	
	public Lista() {
		this.inicio = null;
	}
		
	
	public void inserir(int elemento) {
		Caixinha nova = new Caixinha();
		nova.setElemento(elemento);
		nova.setProximo(null);
		
		if(inicio == null) {
			inicio = nova;
		}else {
			Caixinha aux;
			aux = inicio;
			while(aux != null) {
				aux = aux.getProximo();
			}
			aux.setProximo(nova);
		}
	}
	
	public int retirar() {
		return -1;
		
	}
	public void listar() {
		if(inicio == null) {
			System.out.println("Nada a exitir");
		}else {
			Caixinha aux = inicio;
			while(aux.getProximo() != null) {
				System.out.println("Elemento visto!" + aux.getElemento());
				aux = aux.getProximo();
			}
		}
	}
	public  boolean isEmpty() {
		return this.inicio == null;
		
	}
}
