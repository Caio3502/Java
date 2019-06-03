package br.fadep.sorteio.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Date;

import br.fadep.sorteio.models.Sorteio;


public class SorteioDAO implements SorteioDAOinterface {

	@Override
	public void Salvar(Sorteio sorteio) throws Exception {
		String sql = "INSERT INTO sorteio(nome, data, numeros)"
				+ "VALUES (?, ?, ?)";
				Connection conn = ConnectionFactory.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, sorteio.getNome());
				Date datasql = new Date(sorteio.getData().getTime());
				pstmt.setDate(2, datasql);
				String numeros = "";
				for (Integer numero : sorteio.getNumeros()) {
					numeros += numero.toString() + ",";
				}
				pstmt.setString(3, numeros);
				
				pstmt.execute();
	}
	
	
}
