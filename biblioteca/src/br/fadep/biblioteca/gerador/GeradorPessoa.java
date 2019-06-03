package br.fadep.biblioteca.gerador;

import java.util.Random;

import br.fadep.biblioteca.models.Pessoa;

public class GeradorPessoa {
	public String path;
	private char sexo;
	
	public GeradorPessoa(String new_path, char sexoN) {
		this.path = new_path;
		this.sexo = sexoN;
	}
	
	public Pessoa gerarPessoa() {
		Random   r = new Random();
		FileData f = new FileData();
		String[] nomes = f.catchData(this.path);
		String   nome = nomes[r.nextInt(nomes.length)];
		
		Pessoa p = new Pessoa();
		p.setNome(nome);
		p.setTelefone(gerarTelefone());
		p.setCpf(gerarCPF());
		p.setIdade(gerarIdade());
		p.setSexo(sexo);
			
		System.out.println("nome: " + p.getNome());
		System.out.println("telefone: " + p.getTelefone());
		System.out.println("cpf: " + p.getCpf());
		System.out.println("idade: " + p.getIdade());
		System.out.println("sexo: " + p.getSexo());
		
		return p;
	}	
	public Pessoa[] gerarPessoas() {
		FileData f = new FileData();
		String[] nomes = f.catchData(this.path);
		Pessoa[] pessoasGeradas = new Pessoa[nomes.length];
		
		for (int i = 0; i < nomes.length; i++){
			Pessoa p = new Pessoa();
			p.setNome(nomes[i]);
			p.setTelefone(gerarTelefone());
			p.setCpf(gerarCPF());
			p.setIdade(gerarIdade());
			p.setSexo(gerarSexo());
			pessoasGeradas[i] = p;
			
			System.out.println(p.getNome());
			System.out.println(p.getTelefone());
			System.out.println(p.getCpf());
			System.out.println(p.getIdade());
			System.out.println(p.getSexo());
		}
		return pessoasGeradas;
		
	}	
		
	public static String gerarTelefone() {
		String numeroFinal = "";
		
		Random r = new Random();
		
		String[] ddds = {"46","45","48","49","47","51","52","17","19","55"};
		String[] t1s = {"3525","3524","3220","3556","3521","3523"};
		String[] n = {"0","1","2","3","4","5","6","7","8","9"};
		
		
		String ddd = ddds[r.nextInt(ddds.length)];
		numeroFinal += ddd;
		String t1 = t1s[r.nextInt(t1s.length)];
		numeroFinal += t1;
		for (int i = 6; i < 10; i++){
			numeroFinal += n[r.nextInt(n.length)];	
		}
		return numeroFinal;
	}
	
	public static String gerarCPF(){
		String CPFfinal = "";
		
		Random r = new Random();
		
		String[] n = {"0","1","2","3","4","5","6","7","8","9"};
		
		for (int i = 0; i < 11; i++) {
			CPFfinal += n[r.nextInt(n.length)];
		}
		return CPFfinal;
	}
	
	public static int gerarIdade(){
		int idade;
		Random r = new Random();
		idade = r.nextInt(76);
		return idade;
	}
	
	public static char gerarSexo(){
		char[] sexo = {'F','M'};
		Random r = new Random();
		char sexoFinal = sexo[r.nextInt(2)];
		return sexoFinal;
	}
	
}
