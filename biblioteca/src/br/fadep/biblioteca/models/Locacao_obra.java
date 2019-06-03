package br.fadep.biblioteca.models;

import java.util.Date;

public class Locacao_obra {
	private long id;
	private Date dataDevolucao;
	private float multa;
	private Boolean devolvido;
	private Date data_estimada_devolucao;
	private long id_obra;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	public float getMulta() {
		return multa;
	}
	public void setMulta(float multa) {
		this.multa = multa;
	}
	public Boolean getDevolvido() {
		return devolvido;
	}
	public void setDevolvido(Boolean devolvido) {
		this.devolvido = devolvido;
	}
	public Date getData_estimada_devolucao() {
		return data_estimada_devolucao;
	}
	public void setData_estimada_devolucao(Date data_estimada_devolucao) {
		this.data_estimada_devolucao = data_estimada_devolucao;
	}
	public long getId_obra() {
		return id_obra;
	}
	public void setId_obra(long id_obra) {
		this.id_obra = id_obra;
	}
}
