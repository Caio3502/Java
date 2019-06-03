package br.fadep.passageiro.main;

import br.fadep.passageiro.main.Onibus;
import br.fadep.passageiro.main.Passageiro;

public class Main {
	
	    public static void main(String[] args) throws InterruptedException {

	        Onibus onibusnv = new Onibus ();
	        onibusnv.setLinha(10);
	        
	        Passageiro passageiro = new Passageiro();
	        passageiro.setNome("Caio");
	        passageiro.setIdade(18);
	        passageiro.setCartao(true);
	        passageiro.setSaldoCartao(100);
	        
	        Passageiro passageiro1 = new Passageiro();
	        passageiro1.setNome("Junior");
	        passageiro1.setIdade(9);
	        passageiro1.setCartao(false);
	        passageiro1.setSaldoCartao(10);
	        
	        onibusnv.adicionar(passageiro1);
	        passageiro.pagar(3.20);
	        
	        
	        onibusnv.adicionar(passageiro);
	        passageiro.pagar(3.50);
	        new Thread();
            Thread.sleep(5000);
	        onibusnv.sair(passageiro);
	        
	    }
}
	       

