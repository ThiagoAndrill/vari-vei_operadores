package LacoDecisaoIf;

import java.util.Scanner;

public class ArrayVetor_Explicacao {

	public static void main(String[] args) {

		//Explicação de Array Vetor
		
		Scanner leia = new Scanner(System.in);
		
		float[] media = new float[4];
		float n1, n2, n3, n4, somaMedia = 0, mg;
		int x;
		
		for(x=0;x<4;x++)	{
			
			System.out.println("\nEntre com a primeira nota: ");
			n1 = leia.nextFloat();
			System.out.println("\nEntre com a Segunda nota: ");
			n2 = leia.nextFloat();
			System.out.println("\nEntre com a terceira nota: ");
			n3 = leia.nextFloat();
			
			media[x] = (n1+n2+n3)/3;
			System.out.println("\nMedia: "+media[x]);
			somaMedia += media[x];
			
		}
		
		mg = somaMedia / 4;
		System.out.printf("\nMédia geral da turma foi de: %.2f",mg);
		
		for(x=0;x<4;x++)
			System.out.println("\nMédia do aluno "+(x+1)+" foi de "+media[x]);

	}

}
