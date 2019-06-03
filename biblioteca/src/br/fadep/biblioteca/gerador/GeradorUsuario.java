package br.fadep.biblioteca.gerador;

import java.util.Random;

import br.fadep.biblioteca.models.Pessoa;
import br.fadep.biblioteca.models.Usuario;

public class GeradorUsuario {
	public Usuario[] gerarUsuarios(char sexo) {
		String path = null;
		if (sexo == 'M') {
			path = "C:/Users/João/Desktop/Arquivos/Code/Java/Workspace 0 - Aula/biblioteca/src/br/fadep/biblioteca/gerador/txt/nomesM.txt";
		} else if (sexo == 'F') {
			path = "C:/Users/João/Desktop/Arquivos/Code/Java/Workspace 0 - Aula/biblioteca/src/br/fadep/biblioteca/gerador/txt/nomesF.txt";
		}
		
		GeradorPessoa gp = new GeradorPessoa(path, sexo);
		Pessoa[] pessoas = gp.gerarPessoas();
		Usuario[] usuarios = new Usuario[pessoas.length];
		
		for (int i = 0; i < pessoas.length; i++) {
			Usuario u = new Usuario();
			
			u.setNome(pessoas[i].getNome().toUpperCase());
			u.setTelefone(pessoas[i].getTelefone());
			u.setCpf(pessoas[i].getCpf());
			u.setIdade(pessoas[i].getIdade());
			u.setSexo(pessoas[i].getSexo());
			
			u.setLogin(gerarLogin(pessoas[i].getNome()));
			u.setSenha(gerarSenha());
			
			System.out.println("login: " + u.getLogin());
			System.out.println("senha: " + u.getSenha());
			
			usuarios[i] = u;
		}
		
		return usuarios;
	}
	public Usuario gerarUsuario(char sexo) {
		String path = null;
		
		if (sexo == 'M') {
			path = "C:/Users/João/Desktop/Arquivos/Code/Java/Workspace 0 - Aula/biblioteca/src/br/fadep/biblioteca/gerador/txt/nomesM.txt";
		}
		else if (sexo == 'F') {
			path = "C:/Users/João/Desktop/Arquivos/Code/Java/Workspace 0 - Aula/biblioteca/src/br/fadep/biblioteca/gerador/txt/nomesF.txt";
		}
		
		GeradorPessoa gp = new GeradorPessoa(path, sexo);
		Usuario u = new Usuario();
		Pessoa p = gp.gerarPessoa();
		
		u.setNome(p.getNome().toUpperCase());
		u.setTelefone(p.getTelefone());
		u.setCpf(p.getCpf());
		u.setIdade(p.getIdade());
		u.setSexo(p.getSexo());
		
		u.setLogin(gerarLogin(p.getNome()));
		u.setSenha(gerarSenha());
		
		System.out.println("login: " + u.getLogin());
		System.out.println("senha: " + u.getSenha());
		
		return u;
	}
	public String gerarLogin(String nome) {
		Random r = new Random();
		String login = "";
		
		String[] enfeite_c = {"123", "xXx", "i", "_x","x","","","","","","","","",""};
		String[] enfeite_m = {nome.substring(0, r.nextInt(nome.length())), "", "","","","","",""};
		String[] enfeite_f = {"321", "xXx", "i", "x_","x","","","","","","","","",""};
		int n = r.nextInt(enfeite_c.length);
		
		login += enfeite_c[n];
		
		login += enfeite_m[r.nextInt(enfeite_m.length)];
		
		for(int i = r.nextInt(nome.length()); i < nome.length(); i++) {
			int u = r.nextInt(2);
			if (u == 0){
				login += nome.charAt(i);
			} else {
				login += nome.substring(i, i).toUpperCase();
			}
		}
		if (login.length() < 5) {
			for(int i = r.nextInt(nome.length()); i < nome.length(); i++) {
				int u = r.nextInt(2);
				if (u == 0){
					login += nome.charAt(i);
				} else {
					login += nome.substring(i, i).toUpperCase();
				}
			}
		}
		
		login += r.nextInt(1000);
		login += enfeite_m[r.nextInt(enfeite_m.length)];
		login += enfeite_f[n];
		
		return login;
		
	}
	public String gerarSenha() {
		Random r = new Random();
		String senha = "";
		String char_senha = "QTerFdtvbAyViGwTpaHasdfghjklzVBvbnm123045607890";
		for (int i = 0; i < 5; i++) {
			senha += char_senha.charAt(r.nextInt(char_senha.length()));
		}
		
		return senha;
		
	}

}
