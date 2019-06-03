package br.fadep.classes.models;

import java.util.Date;

public class Conta {
	
	public int numero;
	public double saldo;
	public Cliente Cliente;
	public double limite; 
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Numero: " + numero  + " Saldo: " + saldo + " Cliente: " + Cliente + " Limite: " + limite;
	}
	
//	public void depositar(movimentacao movimento) {
//		this.saldo += movimento.valor;
//		System.out.println("Valor restante atual: " + this.saldo);
		
	//}
	public void depositar(double valorDeposito, Conta contafavorecido) {
		
		movimentacao mov1 = new movimentacao();
		
		mov1.data = new Date();
		mov1.tipo = 1;
		mov1.valor = valorDeposito;
		mov1.favorecido = contafavorecido;
		
		this.saldo += mov1.valor;
	}
}
