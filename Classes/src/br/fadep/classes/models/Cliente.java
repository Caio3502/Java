package br.fadep.classes.models;

public class Cliente {
	
	// Atributos
	
	public String nome; // Public e private são "modificadores de acesso"
	public String telefone;
	public String endereco;
	public int idade;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + nome + ", Telefone: " + telefone + ", Endereço: " + endereco + ", Idade: " + idade;
	}
}
