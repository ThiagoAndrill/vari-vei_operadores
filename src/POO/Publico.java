package POO;

public class Publico extends Telefone {
	
	public Publico() {
		super("Telefone Público");
	}
	
	@Override
	public void tocar(int numToque) {
		
		for(int i=0; i<numToque; i++) {
			System.out.println("Piriririram Piriririram Piriririram");
		}
	}
	
	@Override
	public void discar(String numero) {
		
		if(numero.charAt(0)=='9' || numero.charAt(0)=='8') {
			System.out.println("Este tipo de tenefone não liga para celular");
		} else {
			System.out.println("\nDiscando:"+numero);
		}
		
	}
}
