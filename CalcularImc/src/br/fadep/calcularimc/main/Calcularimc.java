package br.fadep.calcularimc.main;
import java.util.Scanner;

public class Calcularimc {

	public static void main (String[]args) {
		double peso;
		double altura;
		System.out.println("OL�, ESTOU AQUI PARA CALCULAR SEU IMC(INDICE DE MASSA CORPORAL)");
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Para come�armos, informe o seu peso ");
		peso = leia.nextDouble();
		
		System.out.println("Agora, informe a sua altura");
		altura = leia.nextDouble();
		
		double resultadoimc;
		resultadoimc = peso / (altura*altura);
		
		if (resultadoimc < 18.5) {
			System.out.println("Voc� est� abaixo do peso, coma mais!!!");
		}else if (resultadoimc >= 18.5 && resultadoimc  <= 24.9) {
			System.out.println("Seu peso est� normal, mantenha assim");
		}else if (resultadoimc >= 25) {
			System.out.println("Voc� est� com sobrepeso, gordo!!!");
			}
			System.out.println("Seu IMC � "+ resultadoimc);
		}
	}

