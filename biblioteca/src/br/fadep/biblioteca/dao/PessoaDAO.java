package br.fadep.biblioteca.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.fadep.biblioteca.models.Cliente;
import br.fadep.biblioteca.models.Pessoa;

public class PessoaDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet res;
	private String sql;
	
	public long salvar(Pessoa pessoa) throws SQLException {
		conn = ConnectionFactory.getConnection();
		sql = "INSERT INTO pessoa("
				+ "nome, "
				+ "cpf, "
				+ "idade, "
				+ "sexo, "
				+ "telefone)"
				+ "VALUES(?,?,?,?,?)";
		pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		pstmt.setString(1, pessoa.getNome());
		pstmt.setString(2, pessoa.getCpf());
		pstmt.setInt(3, pessoa.getIdade());
		pstmt.setString(4, String.valueOf(pessoa.getSexo()));
		pstmt.setString(5, pessoa.getTelefone());
		pstmt.execute();
		res = pstmt.getGeneratedKeys();
		if (res.next()) {
			return res.getLong(1);
		}
		return 0;
		}

	public Pessoa getPessoa(Long id) throws SQLException {
		Connection conn = ConnectionFactory.getConnection();
		String sql = "SELECT * FROM Pessoa WHERE Pessoa.ID = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setLong(1, id);
		ResultSet res = pstmt.executeQuery();
		Pessoa p = new Pessoa();
		
		if (res.next()) {
			p.setNome(res.getString("nome"));
			p.setCpf(res.getString("CPF"));
			p.setIdade(res.getInt("idade"));
			p.setSexo(res.getString("sexo").charAt(0));
			p.setTelefone(res.getString("telefone"));
			p.setId(res.getLong("id"));
			}
		return p;
		}
	}




