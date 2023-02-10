package LacoDecisaoIf;

import java.util.Scanner;

public class Lista2LacoDeRepeticaoWhileExercicio1 {

	public static void main(String[] args) {

		//Listas 2 - Exercício 1 - Laço de Repetição While
		
		Scanner leia = new Scanner(System.in);
		
		int idade,menor21=0,maior50=0;
		
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();
			
		while(idade>0) {
			
			if(idade<21) {
				
				menor21++;
			}
			
			if(idade>50)	{
				
				maior50++;
				
			}
			
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();
			
		}
		
		System.out.println("Total de pessoas menores de 21 anos: "+menor21);
		System.out.println("Total de pessoas menores de 21 anos: "+maior50);				
			
	}

}
