package br.fadep.biblioteca.gerador;

import java.util.Random;

import br.fadep.biblioteca.models.Cliente;
import br.fadep.biblioteca.models.Pessoa;

public class GeradorCliente {
	public Cliente[] gerarClientes(char sexo) {
		String path = null;
		if (sexo == 'M') {
			path = "C:/Users/João/Desktop/Arquivos/Code/Java/Workspace 0 - Aula/biblioteca/src/br/fadep/biblioteca/gerador/txt/nomesM.txt";
		} else if (sexo == 'F') {
			path = "C:/Users/João/Desktop/Arquivos/Code/Java/Workspace 0 - Aula/biblioteca/src/br/fadep/biblioteca/gerador/txt/nomesF.txt";
		}
		
		GeradorPessoa gp = new GeradorPessoa(path, sexo);
		Pessoa[] pessoas = gp.gerarPessoas();
		Cliente[] clientes = new Cliente[pessoas.length];
		
		for (int i = 0; i < pessoas.length; i++) {
			Cliente c = new Cliente();		
			c.setNome(pessoas[i].getNome());
			c.setTelefone(pessoas[i].getTelefone());
			c.setCpf(pessoas[i].getCpf());
			c.setIdade(pessoas[i].getIdade());
			c.setSexo(pessoas[i].getSexo());
			
			c.setMatricula(gerarMatricula());
			c.setCurso(gerarCurso());
			c.setTipo(gerarTipo());
			
			clientes[i] = c;
		}
		
		return clientes;
	}
	
	public Cliente gerarCliente(char sexo) {
		String path = null;
		
		if (sexo == 'M') {
			path = "C:/Users/João/Desktop/Arquivos/Code/Java/Workspace 0 - Aula/biblioteca/src/br/fadep/biblioteca/gerador/txt/nomesM.txt";
		}
		else if (sexo == 'F') {
			path = "C:/Users/João/Desktop/Arquivos/Code/Java/Workspace 0 - Aula/biblioteca/src/br/fadep/biblioteca/gerador/txt/nomesF.txt";
		}
		
		GeradorPessoa gp = new GeradorPessoa(path, sexo);
		
		Pessoa p = gp.gerarPessoa();
		Cliente c = new Cliente();
		
		c.setNome(p.getNome());
		c.setTelefone(p.getTelefone());
		c.setCpf(p.getCpf());
		c.setIdade(p.getIdade());
		c.setSexo(p.getSexo());
		
		c.setMatricula(gerarMatricula());
		c.setCurso(gerarCurso());
		c.setTipo(gerarTipo());
		
		System.out.println("matricula: " + c.getMatricula());
		System.out.println("curso: " + c.getCurso());
		System.out.println("tipo: " + c.getTipo());
		
		return c;
	}
	
	public int gerarMatricula() {
		Random r = new Random();
		int matricula = r.nextInt(70000);
		
		return matricula;
	}
	
	public String gerarCurso() {
		FileData f = new FileData();
		String[] cursos = f.catchData("C:/Users/João/Desktop/Arquivos/Code/Java/Workspace 0 - Aula/biblioteca/src/br/fadep/biblioteca/gerador/txt/cursos.txt");
		Random r = new Random();
		
		String curso = cursos[r.nextInt(cursos.length)];
		
		return curso;
	}
	
	public int gerarTipo() {
		Random r = new Random();
		int t = r.nextInt(10);
		
		return t;
	}
}
