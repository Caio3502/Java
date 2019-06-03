package br.fadep.heranca.main;

import br.fadep.heranca.models.Gerente;

 class Main {
	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setNome("Maria");
		gerente.setCpf("123.455.334-33");
		gerente.setSenha(321);
		
		gerente.autenticar(321);
	}
}