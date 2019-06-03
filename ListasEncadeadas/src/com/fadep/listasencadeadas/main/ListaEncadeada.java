package com.fadep.listasencadeadas.main;


public class ListaEncadeada {

	private Produto primeiro;
	private Produto ultimo;
	private int totalProdutos;
	
	public void adiciona(String produto) {
		if(this.totalProdutos == 0) {
		   this.adicionaNoComeco(produto);
		}else {
			Produto novoProduto = new Produto(produto);
			this.ultimo.setProximo(novoProduto);
			this.ultimo = novoProduto;
			this.totalProdutos++;
			
			
		}
	}
	private void adicionaNoComeco(String produto) {
		
		Produto novoProduto = new Produto (produto, this.primeiro);
		this.primeiro = novoProduto;
		
		if(this.totalProdutos == 0) {
			this.ultimo = this.primeiro;
		}
		this.totalProdutos++;
		
	}
	public void adiciona(int posicao, String produto) {
		if(posicao == 0) {
			this.adicionaNoComeco(produto);
		}else if (posicao == this.totalProdutos) {
			this.adiciona(produto);
		}else {
			Produto anterior = this.pegaProduto(posicao -1);
			Produto novo = new Produto(produto,
					anterior.getProximo());
			anterior.setProximo(novo);
			this.totalProdutos++;
		}
	}
	
	private Produto pegaProduto(int produto) {
		Produto atual = primeiro;
		for(int i = 0; i < produto; i++) {
			atual = atual.getProximo();
		}
		return atual;
	}
	@Override
	public String toString() {
		
		if(this.totalProdutos == 0) {
			return "[]";
		}
	StringBuilder builder =  new StringBuilder ("[");
	Produto atual = primeiro;
	
	for(int i = 0; i < this.totalProdutos -1;i++) {
		builder.append(atual.getNome());
		builder.append(", ");
		atual = atual.getProximo();
		}	
	builder.append(atual.getNome());
	builder.append("]");
	
	return builder.toString();
	
	}
}
