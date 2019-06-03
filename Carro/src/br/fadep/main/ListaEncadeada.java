package br.fadep.main;

public class ListaEncadeada {
	private Carro primeiro;
	private Carro ultimo;
	private int totalCarros;
	
	public void adiciona(String carro, int ano) {
		if(this.totalCarros == 0) {
			this.PrimeiroCarro(carro, ano);
		}else {
			Carro novoCarro = new Carro(carro, ano);
			this.ultimo.setProximo(novoCarro);
			this.ultimo = novoCarro;
			this.totalCarros++;
			
		}
	}

	private void PrimeiroCarro(String carro, int ano) {
		Carro novoCarro = new Carro(carro, ano, this.primeiro);
		this.primeiro = novoCarro;
		
		if (this.totalCarros == 0) {
			this.ultimo = this.primeiro;
		}
		this.totalCarros++;
	}

	@Override
	public String toString() {
		if (this.totalCarros == 0) {
			return ("Não há carros!");
		}
		StringBuilder builder = new StringBuilder ("[");
		Carro atual = primeiro;
		
		for (int i = 0; i < totalCarros -1; i++) {
			builder.append(atual.getNome());
			builder.append(", ");
			builder.append(atual.getAno());
			builder.append(", ");
			atual = atual.getProximo();
		}
		builder.append(atual.getNome());
		builder.append(atual.getAno());
		builder.append("]");
				
		return super.toString();
	}
}
