package POO;

public class Fixo extends Telefone{

	public Fixo() {
		super("Telefone Fixo");
	}
	
	@Override
	public void tocar(int numToque) {
		
		for(int i=0; i<numToque; i++) {
			System.out.println("trim tim trim");
		}
	}
	
	@Override
	public void discar(String numero) {
		System.out.println("\nDiscando: "+numero);
	}
	
}
