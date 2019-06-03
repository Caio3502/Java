package ultraemojicombat;

import java.util.Random;

public class Luta {
	private Lutador desafiante;
	private Lutador desafiado;
	private int rounds;
	private boolean aprovada;
	
	public void marcarLuta(Lutador l0, Lutador l1 ) {
		if(l0.getCategoria().equals(l1.getCategoria())
				&& l0 != l1 ) {
			this.aprovada = true;
			this.desafiado = l0;
			this.desafiante = l1;
		}else {
			this.aprovada = false;
			this.desafiado = null;
		}
	}
	public void Lutar() {
		if(this.aprovada) {
			System.out.println("### Desafiado ###");
			this.desafiado.apresentar();
			System.out.println("### Desafiante ###");
			this.desafiante.apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			switch(vencedor) {
			case 0:
				System.out.println("EMPATOU");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
			case 1:
				System.out.println("Vitória do" + this.desafiado.getNome());
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
			case 2:
				System.out.println("Vitória do" + this.desafiante.getNome());
				this.desafiado.perderLuta();
				this.desafiante.ganharLuta();
				break;
			}
			
			
		}else {
			System.out.println("A luta não pode acontecer....");
		}
		
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean isAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
}
