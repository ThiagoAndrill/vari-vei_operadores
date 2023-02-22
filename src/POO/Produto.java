package POO;

public class Produto {
	
	//declaração dos atributos da classe
	
	private String nomeDoJogo;
	private String genero;
	private String console;
	private String midia;
	private double valor;
	
	public Produto(String nomeDoJogo, String genero, String console, String midia, double valor) {
		super();
		this.nomeDoJogo = nomeDoJogo;
		this.genero = genero;
		this.console = console;
		this.midia = midia;
		this.valor = valor;
		
	// Declaração dos demais métodos da classe 	

	}

	public String getNomeDoJogo() {
		return nomeDoJogo;
	}

	public void setNomeDoJogo(String nomeDoJogo) {
		this.nomeDoJogo = nomeDoJogo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public String getMidia() {
		return midia;
	}

	public void setMidia(String midia) {
		this.midia = midia;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
		
	public void visualizar() {
		System.out.printf("\nO jogo escolhido foi o %s do genero %s para o console %s em mídia %s no valore de R$%.2f",nomeDoJogo, genero, console, midia, valor);
		
	}
}
