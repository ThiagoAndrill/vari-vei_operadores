package LacoDecisaoIf;

import java.util.Scanner;

public class Lista1_Vetor_Exercicio01 {

	public static void main(String[] args) {

		//Lista 1 - Exercício 01 - Vetor 
		
		//Dado um vetor contendo 10 números inteiros não ordenados e não repetidos, 
		//construa um algoritmo que consiga pesquisar dados no vetor, onde o usuário 
		//irá digitar um número e o programa deve exibir na tela a 
		//posição deste número no vetor. Caso o número não seja encontrado, 
		//a mensagem: “Não foi encontrado!” deve ser exibida na tela.
		
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
