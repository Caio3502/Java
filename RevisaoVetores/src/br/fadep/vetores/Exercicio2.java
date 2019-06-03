package br.fadep.vetores;

public class Exercicio2 {
	public static void main(String[] args) {
		int [] lerValores = {10, 20, 30, 40, 50, 60 };
		
		for(int i = 0; i < lerValores.length; i++) {
			System.out.println(lerValores[i]);
		}
		System.out.println("Ao contrário");
		for(int i = lerValores.length -1; i >= 0; i-- ) {
			System.out.println(lerValores[i]);
		}
	}
	
}
