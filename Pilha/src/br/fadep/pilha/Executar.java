package br.fadep.pilha;

public class Executar {
	
	public static void main(String[] args) {
		Fabrica estruturacao = new Fabrica();
		estruturacao.setManufatura("Estruturacao");
		
		Fabrica funilaria = new Fabrica();
		funilaria.setManufatura("Funilaria");
		
		Fabrica pintura = new Fabrica();
		pintura.setManufatura("Pintura");
		
		Fabrica portas = new Fabrica();
		portas.setManufatura("Portas");
		
		Fabrica motor = new Fabrica();
		motor.setManufatura("motor");
		
		Pilha pilha = new Pilha();
		pilha.insere(estruturacao);
		pilha.insere(funilaria);
		pilha.insere(pintura);
		pilha.insere(portas);
		pilha.insere(motor);
		
		System.out.println(pilha);
		Fabrica objRemovido = pilha.remove();
		System.out.println("Objeto Removido: " + objRemovido);
		System.out.println(pilha);
		System.out.println("O tamanho da pilha é"+ pilha.tamanho() +"Elmentos");
		if(pilha.vazia()) {
			System.out.println("A Pilha está Vazia");
		}
		
		
	}
}
