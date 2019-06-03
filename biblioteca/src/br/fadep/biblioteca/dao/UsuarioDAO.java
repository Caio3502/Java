package br.fadep.biblioteca.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.fadep.biblioteca.models.Usuario;


public class UsuarioDAO {
	
	public void salvar(Usuario usuario) throws SQLException{
		PessoaDAO pessoaDAO = new PessoaDAO();
		long idPessoa = pessoaDAO.salvar(usuario);
		Connection conn = ConnectionFactory.getConnection();
		String sql = "INSERT INTO usuario("
				+ "id, "
				+ "login, "
				+ "senha)"
				+ "VALUES(?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setLong(1, idPessoa);
		pstmt.setString(2,usuario.getLogin());
		pstmt.setString(3,usuario.getSenha());
		
		pstmt.execute();
	}
	
	public void alterar(Usuario usuario) throws SQLException {
		Connection conn = ConnectionFactory.getConnection();
		String sql = "UPDATE usuario set "
				+ "login = ?, "
				+ "senha = ?, "
				+ "WHERE id = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, "'" + usuario.getLogin() + "'");
		pstmt.setString(2, "'" + usuario.getSenha() + "'");
		pstmt.setLong(3, usuario.getId());
		
		pstmt.executeUpdate();
	}
	
	public void deletar(long id) throws SQLException {
		Connection conn = ConnectionFactory.getConnection();
		String sql = "DELETE FROM usuario WHERE id = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setLong(1, id);
		pstmt.execute();	
	}

	public Usuario[] getTodos() throws SQLException {
		Connection conn = ConnectionFactory.getConnection();
		String sql = "SELECT * FROM usuario";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		ResultSet res = pstmt.executeQuery();
		Usuario[] usuarios = new Usuario[res.getFetchSize()];
		while (res.next()) {
			Usuario u = new Usuario();
			u.setLogin(res.getString("login"));
			u.setSenha(res.getString("senha"));
			for (int i = 0; i < usuarios.length; i++) {
				if(usuarios[i] == null) {
					usuarios[i] = u;
					break;
				}
			}
		}
		return usuarios;
	}
	
	public Usuario getUsuario(Long id) throws SQLException {
		Connection conn = ConnectionFactory.getConnection();
		String sql = "SELECT * FROM USUARIO WHERE USUARIO.ID = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setLong(1, id);
		ResultSet res = pstmt.executeQuery();
		Usuario u = new Usuario();
		
		if (res.next()) {
			u.setNome(res.getString("nome"));
			u.setCpf(res.getString("CPF"));
			u.setIdade(res.getInt("idade"));
			u.setSexo(res.getString("sexo").charAt(0));
			u.setTelefone(res.getString("telefone"));
			
			u.setLogin(res.getString("login"));
			u.setSenha(res.getString("senha"));	
		}
		return u;
		}

}
