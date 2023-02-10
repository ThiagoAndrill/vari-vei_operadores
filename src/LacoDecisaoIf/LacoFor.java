package LacoDecisaoIf;

import java.util.Scanner;

public class LacoFor {

	public static void main(String[] args) {

		//Exercício Laço For (EM AULA)
		
		Scanner leia = new Scanner(System.in);
		
		float n1,n2,n3,media,somaMedia=0,mg;
		int x;
		
			for(x=1;x<=4;x++)//x++ = x + 1
				
			{
				
				System.out.println("\nEntre com a primeira nota: ");
				n1 = leia.nextFloat();
				System.out.println("\nEntre com a segunda nota");
				n2 = leia.nextFloat();
				System.out.println("\nEntre com a terceira nota");
				n3 = leia.nextFloat();
				
				media = (n1+n2+n3)/3;
				
				System.out.println("\nMédia do aluno "+x+" foi de: "+media);
				
				somaMedia += media; //somaMedia = somaMedia+ media
				
		}
				mg = somaMedia/4;
				System.out.printf("\nMédia geral: %.2f ",mg);
	}

}
