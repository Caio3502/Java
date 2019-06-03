package Aula05;

public class Aulaa5 {
	public static void main(String[] args) {
		ContaDoBanco p1 = new ContaDoBanco();
		p1.setNumeroConta(1111);
		p1.setDono("Caio");
		p1.abrirConta("CC");
		p1.depositar(100);
		p1.sacar(100);
		p1.pagarMensalidade();
		
		ContaDoBanco p2 = new ContaDoBanco();
		p2.setNumeroConta(2222);
		p2.setDono("Amanda");
		p2.abrirConta("CP");
		p2.depositar(10000);
		p2.sacar(1000);
		
		p1.verConta();
		p2.verConta();
	}
	
}
