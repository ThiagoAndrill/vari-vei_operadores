package LacoDecisaoIf;

import java.util.Scanner;

public class Lista1_Vetor_Exercicio01 {

	public static void main(String[] args) {

		//Lista 1 - Exercício 01 - Vetor 
		
		Scanner leia = new Scanner(System.in);
		
		int[] guardar = {2,5,1,3,4,9,7,8,10,6};
		int x,num, aux = -1;
		
			System.out.println("\nDigite um número: ");
			num = leia.nextInt();
		
		for(x=0;x<guardar.length;x++)	{
			
			if(num == guardar[x]) {
				
				aux = x;
			} 
		}
		
		if(aux != -1)	{
			System.out.println("\nO número "+num+" esta localizado na posição "+aux);
		} else	{
			System.out.println("\nNúmero não encontrado");
		}
	}
}
