package br.com.filas;

public class Filme {
	
	private String nome;
	private String genero;
	private String nacionalidade;
	private int duracao;
	private double bilheteria;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getNacionalidade() {
		return nacionalidade;
	}
	
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public int getDuracao() {
		return duracao;
	}
	
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	public double getBilheteria() {
		return bilheteria;
	}
	
	public void setBilheteria(double bilheteria) {
		this.bilheteria = bilheteria;
	}

	@Override
	public String toString() {
		return "Filme [nome=" + nome + ", genero=" + genero + ", nacionalidade=" + nacionalidade + ", duracao="
				+ duracao + ", bilheteria=" + bilheteria + "]";
	}
	
	

}