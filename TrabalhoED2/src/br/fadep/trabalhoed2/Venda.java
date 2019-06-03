package br.fadep.trabalhoed2;

public class Venda {
	private Produto produto;
	private Pessoa pessoa;
	

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + produto;
	}
}
