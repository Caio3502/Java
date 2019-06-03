package br.fadep.sorteio.ws;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.fadep.sorteio.dao.SorteioDAO;
import br.fadep.sorteio.das.SorteioDAS;
import br.fadep.sorteio.models.Sorteio;

@Path("sorteio")
public class SorteioWS {
	

	@GET
	@Produces(MediaType.APPLICATION_JSON_PATCH_JSON)
	public Response sortear() {
		try {
			List<Integer> lista = new SorteioDAS().gerarNumeros();
			return Response.ok(lista).build();
		} catch (Exception e) {
			return Response.serverError().entity(e.getMessage()).build();
		}
		
	}
	
	@POST
	public Response salvar(Sorteio sorteio) {
		try {
			SorteioDAO sorteioDAO = new  SorteioDAO();
			sorteioDAO.Salvar(sorteio);
			return Response.ok().build();
		}catch (Exception e) {
			return Response.serverError().entity(e.getMessage()).build();
		}
	}
}