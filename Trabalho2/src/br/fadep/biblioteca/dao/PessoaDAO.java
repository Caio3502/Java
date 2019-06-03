package br.fadep.biblioteca.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.fadep.trabalho.main.Pessoa;

public class PessoaDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet res;
	private String sql;
	
	public long salvar(Pessoa pessoa) throws SQLException{
		conn = ConnectionFactory.getConnection();
		sql = "INSERT INTO pessoa("
				+ "nome, "
				+ "cpf, "
				+ "idade,"
				+ "sexo, "
				+ "telefone)"
				+ "VALUES(?,?,?,?,?)";
		pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		
		pstmt.setString(1, pessoa.getNome());
		pstmt.setString(2, pessoa.getCpf());
		pstmt.setInt(3, pessoa.getIdade());
		pstmt.setString(4,String.valueOf(pessoa.getSexo()));
		pstmt.setString(5, pessoa.getTelefone());
		pstmt.execute();
		res = pstmt.getGeneratedKeys();
		if(res.next()) {
			return res.getLong(1);
		}
		return 0;
	}
}
