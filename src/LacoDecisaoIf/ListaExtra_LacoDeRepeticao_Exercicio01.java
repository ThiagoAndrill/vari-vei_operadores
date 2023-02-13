package LacoDecisaoIf;

import java.util.Scanner;

public class ListaExtra_LacoDeRepeticao_Exercicio01 {

	public static void main(String[] args) {

		//Lista Extra - Exercício 1 - Laço De Repetição
		
		int x;
		
		for(x = 1000; x <= 1999; x++)	{
			
			if(x % 11 == 5)	{
				
				System.out.println("\nO número dividos por 11 com resultado 5 são "+x);
				
			}
		}
	}
}