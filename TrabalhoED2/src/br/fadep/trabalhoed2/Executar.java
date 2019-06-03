package br.fadep.trabalhoed2;



public class Executar {
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Caio");
		pessoa.setIdade(19);
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Goão");
		pessoa1.setIdade(12);
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Bola");
		pessoa2.setIdade(15);
		
		Filas fila = new Filas();
		fila.insere(pessoa);
		fila.insere(pessoa1);
		fila.insere(pessoa2);
		fila.remove();
		fila.remove();

		
		Produto produto = new Produto();
		produto.setNome("Maça");
		produto.setPreço(4.99);
		
		Produto produto1 = new Produto();
		produto1.setNome("Pera");
		produto1.setPreço(4.99);
		
		Produto produto2 = new Produto();
		produto2.setNome("Abacate");
		produto2.setPreço(6.99);
		
		
		Venda venda = new Venda();
		venda.setProduto(produto);
		venda.setPessoa(pessoa);
		
		Venda venda1 = new Venda();
		venda1.setProduto(produto1);
		venda.setPessoa(pessoa1);
		
		
		Pilha pilha = new Pilha();
		pilha.insere(venda);
		pilha.insere(venda1);
		//pilha.remove();
		//pilha.remove();
		
		System.out.println(pilha);
	//	System.out.println(venda1);
		
	}
}
