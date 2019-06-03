package br.fadep.biblioteca.models;

public class Obra {
	private long id;
	private long id_obra_genero;
	private long id_obra_editora;
	private long id_obra_autor;
	private String codigo_barras;
	private int ano;
	private String titulo;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getId_obra_genero() {
		return id_obra_genero;
	}
	public void setId_obra_genero(long id_obra_genero) {
		this.id_obra_genero = id_obra_genero;
	}
	public long getId_obra_editora() {
		return id_obra_editora;
	}
	public void setId_obra_editora(long id_obra_editora) {
		this.id_obra_editora = id_obra_editora;
	}
	public long getId_obra_autor() {
		return id_obra_autor;
	}
	public void setId_obra_autor(long id_obra_autor) {
		this.id_obra_autor = id_obra_autor;
	}
	public String getCodigo_barras() {
		return codigo_barras;
	}
	public void setCodigo_barras(String codigo_barras) {
		this.codigo_barras = codigo_barras;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}
