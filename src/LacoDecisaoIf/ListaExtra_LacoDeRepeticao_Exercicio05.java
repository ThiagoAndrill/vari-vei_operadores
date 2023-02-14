package LacoDecisaoIf;

import java.util.Scanner;

public class ListaExtra_LacoDeRepeticao_Exercicio05 {

	public static void main(String[] args) {

		//Listas 1 - Exercício 5 - Laço de Repetição DO...WHILE
		
		Scanner leia = new Scanner(System.in);
		
		int num, soma = 0;
		
		do	{
			
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			
			soma += num;
			
		} while(num != 0);
		
		System.out.println("\nA soma dos números é "+soma);

	}

}
