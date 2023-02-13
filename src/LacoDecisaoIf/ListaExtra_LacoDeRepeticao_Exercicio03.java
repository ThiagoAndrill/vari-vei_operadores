package LacoDecisaoIf;

import java.util.Scanner;

public class ListaExtra_LacoDeRepeticao_Exercicio03 {

	public static void main(String[] args) {

		// Listas 1 - Exercício 3 - Laço de Repetição WHILE
		
			Scanner leia = new Scanner(System.in);
			
			int idade, menor21 = 0, maior50 = 0;
			
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			
			while(idade != -99) {
				
				if(idade < 21)	{
					
					menor21++;
				}
				
				else if(idade > 50)	{
					
					maior50++;
					
			}		
				
				System.out.println("Digite sua idade: ");
				idade = leia.nextInt();
				
		}
			
				System.out.println("Temos "+menor21+" menores de 21 anos");
				System.out.println("Temos "+maior50+" maiores de 50 anos");
	}
}
