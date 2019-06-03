package br.com.filas;

public class Executar {

	public static void main(String[] args) {
		
	 Filme filme = new Filme();
	 filme.setNome("Arca de noé");
	 filme.setNacionalidade("BRASILEIRA");
	 filme.setGenero("Relato");
	 filme.setDuracao(106);
	 filme.setBilheteria(100000000);
	 
	 Filas fila = new Filas();
	 fila.insere(filme);
	 
	 System.out.println(fila.pegar(0));
	 
	 System.out.println(fila.esvaziar());
	 
	 System.out.println(fila.tamanho());
	 
	 System.out.println(fila.vazia());
	}
}