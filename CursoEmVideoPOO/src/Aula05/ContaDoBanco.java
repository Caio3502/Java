package Aula05;

public class ContaDoBanco {
	public int numeroConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public void verConta() {
		System.out.println("Conta: " +this.numeroConta);
		System.out.println("Tipo: "+this.getTipo());
		System.out.println("Dono: "+this.getDono());
		System.out.println("Saldo: "+this.getSaldo());
		System.out.println("Status:"+this.isStatus());
	}
	
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if(t == "CC") {
			this.saldo = 50;
		}else if(t == "CP") {
			this.saldo = 100;	
		}
		System.out.println("A sua conta foi aberta");
	}
	public void fecharConta() {
		if(this.getSaldo()>0) {
			System.out.println("A conta não irá fechar, porque ainda tem dinheiro");
		}else if(this.getSaldo()<0) {
			System.out.println("A conta está endividada, não podera ser fechada.");
		}else {
			this.setStatus(false);
				System.out.println("Conta fechada com sucesso");
			}
		}
	
	public void depositar(float valor) {
		if(this.isStatus()){
			this.setSaldo(this.getSaldo() + valor);
		}else {
			System.out.println("A conta está fechada");
		}
	}
	public void sacar(float sacando) {
		if(this.isStatus()) {
			if(this.getSaldo() >= sacando) {
				this.setSaldo(this.getSaldo() - sacando);
				System.out.println("Saque realizado na conta " +this.getDono());
			}else {
				System.out.println("Saldo insuficiente para saaque");
			}
		}else {
			System.out.println("Não é possivel sacar, a conta está fechada");
		}
	}
	public void pagarMensalidade() {
		int v;
		if (this.getTipo() =="CC" ) {
			v = 12;
		}else {
			v= 20;
		}if(this.isStatus()) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga com sucesso" + this.getDono());
		}else {
			System.out.println("Impossivel pagar");
		}
		
	}
	public ContaDoBanco() {
		this.setSaldo(0);
		this.setStatus(false);
	}
}
