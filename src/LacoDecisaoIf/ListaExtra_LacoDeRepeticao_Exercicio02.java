package LacoDecisaoIf;

import java.util.Scanner;

public class ListaExtra_LacoDeRepeticao_Exercicio02 {

	public static void main(String[] args) {
		
		// Listas 1 - Exercício 2 - Laço de Repetição For
		
		Scanner leia = new Scanner(System.in);
		
		int num, x, numPar = 0, numImp = 0;		
		
		for(x = 1; x <= 10; x++) {
			
			System.out.println("Digite um número ");
			num = leia.nextInt();
				
				if(num % 2 == 0)	{
					
					numPar++;
					
				} else {
					
					
					numImp++;
			}
		}
		
		System.out.println("\nTemos "+numPar+" números pares");
		System.out.println("\nTemos "+numImp+" números Impares");
		
	}	
}