package br.fadep.heranca.main;

public class Main {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Caio");
		p2.setNome("MARIA");
		p3.setNome("Claudio");
		p4.setNome("Matheus");
		p2.setSexo("Masculino");
		
	}
	
}
