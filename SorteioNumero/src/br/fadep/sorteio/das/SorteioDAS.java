package br.fadep.sorteio.das;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SorteioDAS {

	public List<Integer> gerarNumeros() throws Exception {
		Random random = new Random();
		
		List<Integer> listaNumeros = new ArrayList<>();
		for (int i = 0; i < 6; i++){
			int numero = random.nextInt(60) +1;
			listaNumeros.add(numero);
		}
		return listaNumeros;
	}
}
