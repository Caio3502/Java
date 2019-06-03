package br.fadep.biblioteca.ws;

import java.util.List;

import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.fadep.biblioteca.dass.ClienteDASS;
import br.fadep.biblioteca.models.Cliente;
import sun.security.provider.certpath.ResponderId;


@Stateless
@Path("cliente")

public class ClienteWs {
	
	@GET
	@Path("testar")
	public String teste() {
		return "Teste realizado com sucesso!";
	}
	
	@POST
	@Path("salvar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String salvar(Cliente cliente) {
		ClienteDASS clienteDas = new ClienteDASS();
		try {
			clienteDas.salvar(cliente);
			return "ok";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Erro ao Salvar";
	}
	
	@GET
	@Path("getTodos")
	@Consumes(MediaType.APPLICATION_JSON_PATCH_JSON)
	@Produces(MediaType.APPLICATION_JSON_PATCH_JSON)
	public Response getTodos() {
		try {
			ClienteDASS clienteDAS = new ClienteDASS();
			List<Cliente> lista = clienteDAS.getTodos();
			
			return Response.ok(lista).build();
		} catch (Exception e){
			return Response.serverError().entity(e.getMessage()).build();
		}
	}

	@GET
	@Path("getCliente")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	
	public Response  getCliente(@PathParam("id")Long id) {
		try {
			ClienteDASS clienteDASS = new ClienteDASS();
			Cliente cliente = clienteDASS.getCliente(id);
			return Response.ok(cliente).build();
		} catch (Exception e) {
			return Response.serverError().entity(e.getMessage()).build();
		}
	}
	
	@DELETE
	@Path("deletar/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response deletar(@PathParam("id") Long id) {
		try {
			ClienteDASS clienteDAS = new ClienteDASS();
			clienteDAS.deletar(id);
			return Response.ok("Deletado Com Sucesso").build();		
		}catch (Exception e) {
			return Response.serverError().entity(e.getMessage()).build();
		}
	}
	
}