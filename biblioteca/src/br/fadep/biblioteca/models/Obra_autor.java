package br.fadep.biblioteca.models;

import java.util.Date;

public class Obra_autor {
	private long id;
	private String nome;
	private String descricao;
	private Date falecimento;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getFalecimento() {
		return falecimento;
	}
	public void setFalecimento(Date falecimento) {
		this.falecimento = falecimento;
	}
}
