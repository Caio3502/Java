package br.fadep.exercicio;
public class Executa2 {
	public static void main(String[] args) {
		
		Palindromo palindromo = new Palindromo();
		
		palindromo.empilha('a');
		palindromo.empilha('r');
		palindromo.empilha('a');
		palindromo.empilha('r');
		palindromo.empilha('a');
		
		System.out.println(palindromo);
		System.out.println(palindromo.inverterString(palindromo.toString()));
		
		if (palindromo.toString().equals(palindromo.inverterString(palindromo.toString()))) {
			System.out.println(palindromo.toString() + " � um nome pal�ndromo");
		} else {
			System.out.println(palindromo.toString() + " n�o � um nome pal�ndromo");
		}	
	}
}

