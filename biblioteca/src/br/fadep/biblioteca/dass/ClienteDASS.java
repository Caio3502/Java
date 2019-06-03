package br.fadep.biblioteca.dass;

import java.util.List;

import br.fadep.biblioteca.dao.ClienteDAO;
import br.fadep.biblioteca.models.Cliente;

public class ClienteDASS {
	
	private ClienteDAO clienteDAO;
	
	public ClienteDASS() {
		this.clienteDAO = new ClienteDAO();
	}
	
	public void salvar(Cliente clienteDASS) throws Exception {
		if(clienteDASS.getSexo() == 'M' || clienteDASS.getSexo() == 'F') {
			this.clienteDAO.salvar(clienteDASS);
		}else {
			throw new Exception("Erros ao tentar salvar o cliente, sexo invalido");
		} 
	}
	public List<Cliente> getTodos() throws Exception {
		return this.clienteDAO.getTodos();
	}
	public Cliente getCliente(Long id) throws Exception {
		return this.clienteDAO.getCliente(id);
	}
	
	public void deletar(Long id) throws Exception {
		this.clienteDAO.deletar(id);
	}
}
