package LacoDecisaoIf;

import java.util.Scanner;

public class LacoDoWhile {

	public static void main(String[] args) {

		//Exercício Laço do While (EM AULA)
		
		Scanner leia = new Scanner(System.in);
		
		int tabuada,x=1,res;
			
			System.out.println("\nEntre com a tabuada: \n");
			tabuada = leia.nextInt();
			
		do {
			
			res = tabuada * x;
			System.out.println("\n"+tabuada+" X "+x+" = "+res);
			x++;
			
		} while(x<=10);
		

	}

}
