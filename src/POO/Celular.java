package POO;

public class Celular extends Telefone{

	public Celular() {
		super("Telefone Celular");
	}
	
	@Override
	public void tocar(int codigoToque) {
		switch(codigoToque) {
		case 1:
			System.out.println("Power Rangers.MP3");
			break;
		case 2:
			System.out.println("blim blim blim");
			break;
			default:
				System.out.println("parãrã parãrã parãrã");
		}
	}
	
	@Override
	public void discar(String numero) {
		System.out.println("O número: " +numero+ " é um celular...");
	}

}
