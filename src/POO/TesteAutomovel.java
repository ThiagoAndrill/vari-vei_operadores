package POO;

public class TesteAutomovel {

	public static void main(String[] args) {

		//Instanciando um objeto da classe automovel 
		
		Automovel auto1 = new Automovel("Anna Sophia", "Mercedez AMG","BCR6942",2023);
		
		auto1.imprimirInfo();
		
		System.out.println("\nTransferência de proprietário");
		auto1.setNomeProprietario("Elissandro");
		auto1.imprimirInfo();
		
		System.out.println("\nMudança de placa");
		auto1.setPlaca("PVH8B09");
		auto1.imprimirInfo();
		
	}

}
