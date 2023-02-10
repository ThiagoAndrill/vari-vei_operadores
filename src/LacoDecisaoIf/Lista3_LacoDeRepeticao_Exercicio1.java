package LacoDecisaoIf;

import java.util.Scanner;

public class Lista3_LacoDeRepeticao_Exercicio1 {

	public static void main(String[] args) {

		//Listas 3 - Exercício 1 - Laço de Repetição Do...While
		
		Scanner leia = new Scanner(System.in);
		
		int n1,soma=0;
		
		do {
			
			System.out.println("Digite um número ");
			n1 = leia.nextInt();
			
			if(n1>0)	{
				
				soma += n1;
				
			}
			
		} while(n1 != 0);
		
		System.out.println("A soma dos números positivos é "+soma);

	}

}
