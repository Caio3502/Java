package br.fadep.passageiro.main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Onibus {
	 private int linha;
	    private Passageiro[] passageiros = new Passageiro [5];

	    public int getLinha() {
	        return linha;
	    }
	    public void setLinha(int linha) {
	        this.linha = linha;
	    }
	    public Passageiro[] getPassageiros() {
	        return passageiros;
	    }
	    
	    public void adicionar(Passageiro passageiro) {
	    	 Date d1 = new Date();
	         DateFormat df3;
	             String f3 = "hh:mm:ss"; 
	         df3 = new SimpleDateFormat(f3);
	         System.out.println(df3.format(d1));
	    	for (int i = 0; i < this.passageiros.length; i++){
				if (this.passageiros[i] == null){
					this.passageiros[i] = passageiro;
					System.out.println("Passageiro: " + passageiro.getNome() +", Adicionado no Acento: " + i);
					break;
				}
	    	}		
	    }
	    public void sair(Passageiro passageiro) {
	    	 Date d1 = new Date();
	         DateFormat df3;
	             String f3 = "hh:mm:ss";
	         df3 = new SimpleDateFormat(f3);
	         System.out.println(df3.format(d1));
	    	for (int i = 0; i < this.passageiros.length; i++){
				if (this.passageiros[i] == passageiro){
					this.passageiros[i] = null;
				}
	    	}
	    }
	}