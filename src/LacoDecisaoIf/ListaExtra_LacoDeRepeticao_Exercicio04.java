package LacoDecisaoIf;

import java.util.Scanner;

public class ListaExtra_LacoDeRepeticao_Exercicio04 {

	public static void main(String[] args) {
		
		// Listas 1 - Exercício 4 - Laço de Repetição WHILE
		
			Scanner leia = new Scanner(System.in);
			
			int x = 1, idade, ideGen, personalidade = 0, maior40 = 0, menor18 = 0, calma = 0, mlhnervosa = 0, agressiva = 0, outrosCalmos = 0;
			
			while(x <= 150)	{
				
				System.out.println("Qual é a sua idade? ");
				idade = leia.nextInt();
				
				System.out.println("Qual é o seu genero? ");
				System.out.println("1 - Masculino");
				System.out.println("2 - Feminino ");
				System.out.println("3 - Outros");
				ideGen = leia.nextInt();
				
				System.out.println("Qual é a sua personalidade? ");
				System.out.println("1 - Calma(o) ");
				System.out.println("2 - nervosa(o) ");
				System.out.println("3 - Agressiva(o) ");
				personalidade = leia.nextInt();
				
				if(personalidade == 1) {
					calma++;
				}
				
				if(ideGen == 2 && personalidade == 2) {
					mlhnervosa++;
				}
				
				if(ideGen == 1 && personalidade == 1) {
					agressiva++; 
				}
				
				if(ideGen == 3 && personalidade == 3)	{
					outrosCalmos++;
				}
				
				if(personalidade == 2 && idade > 40)	{
					maior40++;					
				}
				
				if(personalidade == 1 && idade < 18)	{
					menor18++;
				}
				
				x++;		//Aqui finaliza o programa para não ficar em looping infinito
		}
			
				System.out.println("\nO número de pessoas calmas é um total de "+calma+" pessoas");
				System.out.println("\nO número de mulheres nervosas é de "+mlhnervosa);
				System.out.println("\nO número de homens agressivos é de "+agressiva);
				System.out.println("\nO número de outros calmos é de "+outrosCalmos);
				System.out.println("\nO número de pessoas nervosas, com mais de 40 anos, é um total de "+maior40+" pessoas");
				System.out.println("\nO número de pessoas, calmas com menos de 18 anos, é um total de "+menor18+" pessoas");
				
				}
}