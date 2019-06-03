package br.fadep.biblioteca.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.fadep.biblioteca.dao.ClienteDAO;
import br.fadep.biblioteca.dao.ConnectionFactory;
import br.fadep.biblioteca.dao.UsuarioDAO;
import br.fadep.biblioteca.dass.ClienteDASS;
import br.fadep.biblioteca.gerador.GeradorCliente;
import br.fadep.biblioteca.gerador.GeradorPessoa;
import br.fadep.biblioteca.gerador.GeradorUsuario;
import br.fadep.biblioteca.models.Cliente;
import br.fadep.biblioteca.models.Usuario;

public class Main {
	

	public static void main(String[] args) {
		Connection conn;
		try {
			System.out.println("Faça seu Cadastro ");
			
			Cliente c = new Cliente();
			String nome = cin("Seu nome:");
			c.setNome(nome);
			
			String cpf = cin("CPF");
			c.setCpf(cpf);
			
			String idade = cin("Idade");
			c.setIdade(Integer.parseInt(idade));
			
			String sexo = cin("Informe o sexo");
			c.setSexo(sexo.charAt(0));
			
			String matricula = cin("Sua Matrícula");
			c.setMatricula(Integer.parseInt(matricula));
			
			String curso = cin("Curso");
			c.setCurso(curso);
			
			String tipo = cin("Informe o tipo");
			c.setTipo(Integer.parseInt(tipo));
			
			String telefone = cin("Informe o telefone");
			c.setTelefone((telefone));
			
			ClienteDASS clienteDASS= new ClienteDASS();
			clienteDASS.salvar(c);
			
			System.out.println("CLIENTE SALVO COM SUCESSO!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String cin(String mensagem) {
		return JOptionPane.showInputDialog(mensagem);
	}
}
