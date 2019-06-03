package br.fadep.estruturadedados.main;

public class Vetores {
	//Um vetor (array) � a estrutura dedados mais simples que existe 
	//Um vetor armazena um sequ�ncia de valores onde todos s�o do mesmo tipo
	
	public static void main(String[] args) {
		double [] temperaturas = new double [365];
		temperaturas [0] = 31.2;
		temperaturas [1] = 32.2;
		temperaturas [2] = 36.2;
		temperaturas [3] = 31.8;
		temperaturas [4] = 40.2;
		// Para acessar a posi��o do array usamos [] por exemplo
		System.out.println("O valor da temperatura do 3� dia �: " + temperaturas[2]);
		
		// Para saber o tamanho do array
		System.out.println("O tamanho do array:" + temperaturas.length);
		
		for (double temp : temperaturas) {
			System.out.println(temp);
		}
		
		
	}
}

