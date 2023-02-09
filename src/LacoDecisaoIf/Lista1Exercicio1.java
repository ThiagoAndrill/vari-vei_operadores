package LacoDecisaoIf;

import java.util.Scanner;

public class Lista1Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Lista 1 - Execício 1 - Laço Condicional If: Camada Condicional If
		
		int a,b,c,soma;
		
			System.out.println("Digite o valor de A: \n");
			a = leia.nextInt();
			System.out.println("\nDigite o valor de B: \n");
			b = leia.nextInt();
			System.out.println("\nDigite o valor de C: \n");
			c = leia.nextInt();
		
		if(a+b>c) {
			
			System.out.println("\nA soma A + B é maior que C \n");
			
		}
		
		else if(a+b<c) {
			
			System.out.println("\nA soma A + B é menor que C \n");
			
		}
		
		else {
			
			System.out.println("\nA soma + B é igual a C \n");
			
		}

	}

}
