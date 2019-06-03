package br.fadep.vetores.main;

public class Vetor {
	public static void main(String[] args) {
	// Armazenar temperaturas
	// Se fossemos gravar temperaturas referente a 365 dias do ano
	
//	double tempoDia01 = 33.2;
//	double tempoDia02 = 30;
//	double tempoDia03 = 29.5
	
	double[] temperaturas = new double [5];
	temperaturas[0] = 33.2;
	temperaturas[1] = 30;
	temperaturas[2] = 28.5;
	temperaturas[3] = 27.3;
	temperaturas[4] = 25;
	
	System.out.println("O valor da temperatura é " + temperaturas[2]);
	}
}
