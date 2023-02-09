package LacoDecisaoIf;

import java.util.Scanner;

public class CorrecaoIf4 {

	public static void main(String[] args) {
		
		// CORREÇÃO DO EXERCÍCIO QUE EU NÃO CONSEGUI FAZER
		
		Scanner leia = new Scanner(System.in);
		
		String palavra1,palavra2,palavra3;
		
			System.out.println("\nEntre com a primeira palavra:");
			palavra1 = leia.next();
			System.out.println("\nEntre com a segunda palavra:");
			palavra2 = leia.next();
			System.out.println("\nEntre com a terceira palavra:");
			palavra3 = leia.next();
		
		if(palavra1.equalsIgnoreCase("vertebrado"))	{	
		
			if(palavra2.equalsIgnoreCase("ave"))	{
				
				if(palavra3.equalsIgnoreCase("carnívoro")) {

					System.out.println("\nÉ uma aguia");
					
				}else {
					
					System.out.println("\nÉ uma pomba");

			}

		}
	
	}
	
}

}