package br.fadep.estruturadedados.main;



public class VetorObjeto {
	
	private Object [] elementos; 
	private int tamanho;
	
	public VetorObjeto(int capacidade) {
		this.elementos = new Object[capacidade];
		this.tamanho = 0;
		
		
	}	
	public boolean adiciona (Object elemento){
		this.aumentarcapacidade(); 
		if (this.tamanho <  this.elementos.length) {
		this.elementos[this.tamanho] = elemento;
		this.tamanho ++;
		return true;
		} 
		return false;
		}
	// 0 1 2 3 4 5 6
	// b c e f g + +  	
	public boolean adiciona(int posicao, Object elemento) {
		this.aumentarcapacidade();
		if (!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posi��o Inv�lida");			
		}
		
		this.aumentarcapacidade();
		//mover todos os elementos
		for(int i= this.tamanho - 1; i>=posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		
		return true;
		
	}
	
	private void aumentarcapacidade() {
		if(this.tamanho == this.elementos.length) {
			Object [] elementosNovos = new Object [this.elementos.length * 2];
			for(int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
				
			}
			this.elementos = elementosNovos;
		}
	}
	
	public Object busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posi��o Inv�lida");			
		}
	return this.elementos[posicao];
	}
	

	public void remove(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posi��o Inv�lida");		
	}
	for(int i=posicao; i<this.tamanho - 1; i++) {
		this.elementos[i] = this.elementos[i + 1];
	}
	this.tamanho --;
	}
	
	public int tamanho () {
		return this.tamanho;
	}
	@Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");		
		}
		if (this.tamanho > 0 ) {
			s.append(this.elementos[this.tamanho - 1]);
		}
		s.append ("]");
		
		return s.toString();
		}

}
