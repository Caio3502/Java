package br.fadep.prova.main;

public class Exercicio3 {
	public static void main(String[] args) {
		double [] nota = {8.2, 10, 5.0, 4.6, 9.7,3.6, 1.8, 3.6,9.1,10};
		double mediaGeral = 0;
		
		for(int i = 0; i < nota.length; i++) {
			mediaGeral = mediaGeral + nota[i];
			
		}
		double notaFinal;
		notaFinal = mediaGeral /10;
		System.out.println("A nota da turma é: " + notaFinal);
	}
	
}
