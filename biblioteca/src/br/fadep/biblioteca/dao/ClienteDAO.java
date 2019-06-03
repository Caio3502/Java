package br.fadep.biblioteca.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.fadep.biblioteca.models.Cliente;
import br.fadep.biblioteca.models.Pessoa;

public class ClienteDAO {
	
	public ClienteDAO() {
		System.out.println("Instaciou a classe ClienteDAO");
	}
	
	public void salvar(Cliente cliente) throws SQLException{
		PessoaDAO pessoaDAO = new PessoaDAO();
		long idPessoa = pessoaDAO.salvar(cliente);
		Connection conn = ConnectionFactory.getConnection();
		String sql = "INSERT INTO cliente("
				+ "id, "
				+ "matricula, "
				+ "curso, "
				+ "tipo) "
				+ "VALUES(?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setLong(1, idPessoa);
		pstmt.setInt(2, cliente.getMatricula());
		pstmt.setString(3,cliente.getCurso());
		pstmt.setInt(4, cliente.getTipo());
		
		pstmt.execute();
	}

	public void alterar(Cliente cliente) throws SQLException {
		Connection conn = ConnectionFactory.getConnection();
		String sql = "UPDATE cliente set "
				+ "matricula = ?, "
				+ "curso = ?, "
				+ "tipo = ?, "
				+ "WHERE id = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, cliente.getMatricula());
		pstmt.setString(2, cliente.getCurso());
		pstmt.setInt(3, cliente.getTipo());
		pstmt.setLong(4, cliente.getId());
		
		pstmt.executeUpdate();
	}
	
	public void deletar(long id) throws SQLException {
		Connection conn = ConnectionFactory.getConnection();
		String sql = "DELETE FROM cliente WHERE id = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setLong(1, id);
		pstmt.execute();	
	}
	
	public List<Cliente> getTodos() throws SQLException {
		Connection conn = ConnectionFactory.getConnection();
		String sql = "SELECT * FROM cliente";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		ResultSet res = pstmt.executeQuery();
		List<Cliente> clientes = new ArrayList<Cliente>();
		PessoaDAO pessoaDAO = new PessoaDAO();
		while (res.next()) {
			Cliente c = new Cliente();
			Pessoa pessoa = pessoaDAO.getPessoa(res.getLong("id"));
			c.setNome(pessoa.getNome());
			c.setCpf(pessoa.getCpf());
			c.setIdade(pessoa.getIdade());
			c.setTelefone(pessoa.getTelefone());
			c.setSexo(pessoa.getSexo());
			c.setId(pessoa.getId());
			
			c.setMatricula(res.getInt("matricula"));
			c.setCurso(res.getString("curso"));
			c.setTipo(res.getInt("tipo"));
			clientes.add(c);
		}
		return clientes;
	}
	
	public Cliente getCliente(Long id) throws SQLException {
		Connection conn = ConnectionFactory.getConnection();
		String sql = "SELECT * FROM CLIENTE WHERE CLIENTE.ID = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setLong(1, id);
		ResultSet res = pstmt.executeQuery();
		Cliente c = new Cliente();
		
		if (res.next()) {
			c.setNome(res.getString("nome"));
			c.setCpf(res.getString("CPF"));
			c.setIdade(res.getInt("idade"));
			c.setSexo(res.getString("sexo").charAt(0));
			c.setTelefone(res.getString("telefone"));
			
			c.setMatricula(res.getInt("matricula"));
			c.setCurso(res.getString("curso"));
			c.setTipo(res.getInt("tipo"));
			}
		return c;
		}
	}

