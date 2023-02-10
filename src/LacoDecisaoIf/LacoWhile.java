package LacoDecisaoIf;

import java.util.Scanner;

public class LacoWhile {

	public static void main(String[] args) {

		//Exercício Laço While (EM AULA)
		
		Scanner leia = new Scanner(System.in);
		
			int num, somaPar=0;
			
				System.out.println("Entre com um número: ");
				num = leia.nextInt();
				
			while(num!=99)	{
				
				if(num % 2 == 0) {
					
					somaPar += num;
				
			}
			
				System.out.println("Entre com um número: ");
				num = leia.nextInt();

	}
	
				System.out.println("Somatório dos números pares: "+somaPar);

}
	
}
