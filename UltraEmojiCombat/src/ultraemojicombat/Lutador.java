package ultraemojicombat;

public class Lutador {
	private String nome;	
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias, derrotas, empates;
	
	public void apresentar() {
		System.out.println("---------------------------------------");
		System.out.println("Nome:" + this.getNome());
		System.out.println("Nacionalidade: " + this.getNacionalidade());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Altura: "+ this.getAltura());
		System.out.println("Peso:" + this.getPeso());
		System.out.println("Categoria: " +this.getCategoria());
		System.out.println("Vitorias: " +this.getVitorias());
		System.out.println("Empates: "+ this.getEmpates());
		System.out.println("Derrotas: "+ this.getEmpates());
	}
	public void status() {
		System.out.println(this.getNome() + "É um peso" +this.getCategoria());
		System.out.println("Ganhou, " + this.getVitorias() + " Vezes");
		System.out.println("Empatou, " + this.getEmpates() + " Vezes");
		System.out.println("Perdeu, " +this.getDerrotas() + " Vezes");	
	}
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() +1);	
	}
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() +1);
	}
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() +1);
	}
	public Lutador(String nome, String nacionalidade, int idade, double d, float e, int vitorias, int derrotas,
			int empates) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = (float) d;
		this.setPeso(e);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}
	public String getCategoria() {
		return categoria;
	}
	private void setCategoria() {
		if(this.peso < 52.2) {
			this.categoria = "INVÁLIDA";
		}else if (this.peso <= 70.3) {
			this.categoria = "PESO LEVE";
		}else if (this.peso <= 83.9) {
			this.categoria = "Peso Médio";
		}else if (this.peso <= 120.2) {
			this.categoria = "PESADO";
		}else {
			this.categoria = "INVÁLIDO";
		}
	}
	public int getVitorias() {
		return vitorias; 
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	
}
