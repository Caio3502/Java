package br.fadep.sorteio.models;

import java.util.Date;
import java.util.List;

public class Sorteio {
	private String nome;
	private Date data;
	private List<Integer> numeros;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public List<Integer> getNumeros() {
		return numeros;
	}
	public void setNumeros(List<Integer> numeros) {
		this.numeros = numeros;
	}
	
	
}
