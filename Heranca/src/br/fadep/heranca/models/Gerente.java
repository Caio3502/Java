package br.fadep.heranca.models;

public class Gerente extends Funcionario{
	

	private int senha;
	
	
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autenticar(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}
}
	
	
