package br.fadep.biblioteca.models;
import java.util.Date;

public class Locacao {
	private long id;
	private long id_cliente;
	private long id_usuario;
	private Date data;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(long id_cliente) {
		this.id_cliente = id_cliente;
	}
	public long getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(long id_usuario) {
		this.id_usuario = id_usuario;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
}
