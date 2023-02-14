package LacoDecisaoIf;

import java.util.Scanner;

public class ListaExtra_lacoDeRepeticao_Exercicio06 {

	public static void main(String[] args) {

		//Listas 1 - Exercício 6 - Laço de Repetição DO...WHILE
		
		Scanner leia = new Scanner(System.in);
		
		int num, soma = 0, media, mult3 = 0;
		
		do	{
			
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			
			if(num % 3 == 0)	{
				
				soma += num;
				
				mult3++;
				
			}
			
		} while(num != 0);
		
		media = soma / mult3;		
		System.out.println("\nA média dos número multiplos de 3 é "+media);

	}

}
