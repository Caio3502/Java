package br.fadep.classes.main;

import java.util.Date;

import br.fadep.classes.models.Cliente;
import br.fadep.classes.models.Conta;
import br.fadep.classes.models.movimentacao;

public class Main {

	public static void main(String[] args) {
	
		//Declaração  da variavel cliente " Cliente " do tipo Cliente
		// E intaânciando a Classe para a variavel 
		// Ou seja, estou atribuindo um novo objeto Cliente
		// Para a Classe "cliente"
		
		Cliente Cliente = new Cliente ();
		// Atribuindo valores para o Objeto cliente
		
		Cliente.nome = "Caio";
		Cliente.idade = 18;
		Cliente.telefone = "(66) 66666-66666";
		Cliente.endereco = "Rua Perdizes, 190";
		
		System.out.println("O cliente é: " + Cliente);
		
		Conta ContaNerco = new Conta ();
		ContaNerco.numero = 2445-2;
		ContaNerco.saldo = 1000;
		ContaNerco.Cliente  = Cliente;
		ContaNerco.limite = 100000;
		
		System.out.println("Sua conta: " + ContaNerco);
		
		
		
//		ContaNerco.depositar(mov1);	
//		
//		movimentacao mov2 = new movimentacao();
//		
//		mov2.data = new Date();
//		mov2.tipo = 1;
//		mov2.valor = 400.0;
//		mov2.depositante = ContaNerco;
//		mov2.favorecido = ContaNerco;
//		
//		ContaNerco.depositar(mov2);		
//		
		ContaNerco.depositar(200.0, ContaNerco);
		System.out.println(ContaNerco.saldo);
		
			
					
		}
		
	}

