package LacoDecisaoIf;

import java.util.Scanner;

public class Lista2Exercicio1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		//Lista 2 - Execício 1 - Laço Condicional Switch: Camada Condicional Switch
		
		double valor;
		int cod,qtd;
		
			System.out.println("\tLANCHONETE DO THIAGO\n");
			System.out.println("\t\tMENU\n");
			System.out.println("Escolha o melhor pra você!\n");
			System.out.println("1 - CACHORRO QUENTE - R$10,00");
			System.out.println("2 - X-SALADA - R$15,00");
			System.out.println("3 - X-BACON - R$18,00");
			System.out.println("4 - BAURU - R$12,00");
			System.out.println("5 - COCA-COLA - R$8,00");
			System.out.println("6 - SUCO DE LARANJA - R$13,00\n");
			
			System.out.println("Digite o código do produto: \n");
			cod = leia.nextInt();
			
			System.out.println("\nDigite a quantidade do produto:\n ");
			qtd = leia.nextInt();
		
		switch(cod) {
		
		case 1:
			
			valor = qtd*10;
			System.out.println("\n1 - CACHORRO QUENTE - R$10,00 - R$"+valor);
			
		break;
		
		case 2:
			
			valor = qtd*15;
			System.out.println("\n2 - X-SALADA - R$15,00 - R$ "+valor);
			
		break;
		
		case 3:
			
			valor = qtd*18;
			System.out.println("\n3 - X-BACON - R$18,00 - R$"+valor);
			
		break;
		
		case 4:
			
			valor = qtd*12;
			System.out.println("\n4 - BAURU - R$12,00 - R$ "+valor);
			
		break;
		
		case 5:
			
			valor = qtd*8;
			System.out.println("\n5 - COCA-COLA - R$8,00 - R$ "+valor);
			
		break;
		
		case 6:
			
			valor = qtd*13;
			System.out.println("\n6 - SUCO DE LARANJA - R$13,00  - R$ "+valor);
			
		break;
		
		default:
			
			System.out.println("\nOPÇÃO INVALIDA!!!\n");
			
		}
		
	}
	
}