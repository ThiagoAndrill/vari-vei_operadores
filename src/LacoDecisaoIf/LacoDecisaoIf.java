package LacoDecisaoIf;

import java.util.Scanner;

public class LacoDecisaoIf {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Exercício Laço de decisão If
		
		double n1,n2,n3,media; 
		int op;
		
			System.out.println("Entre com a primeira nota: \n");
			n1 = leia.nextDouble();
			System.out.println("\nEntre com a segunda nota: \n");
			n2 = leia.nextDouble();
			System.out.println("\nEntre com a terceira nota: \n");
			n3 = leia.nextDouble();
			
			media = (n1+n2+n3)/3;
		
		if(media>=7 && media<=10) {
			
			System.out.println("\nParabéns, você foi APROVADO!!!\n");
			
		}
		
		else if(media>=5 && media<7) {
			
			System.out.println("\nAtenção, você ficou de Exame!!!");
			
		}
		
		else if(media>=0 && media<5) {
			
			System.out.println("\nPoxa vida, você foi REPROVADO!!!");
			
		}
		
		else {
			
			System.out.println("\nPro favor, verifique as notas pois a médoa deu errado.");
			
		}
		
			System.out.println("\n\t\tMenu de elogios");
			System.out.println("\nEscolha um elogio para a família 60");
			System.out.println("\n1 - Sensacional!!!");
			System.out.println("\n2 - Incrível!!!");			
			System.out.println("\n3 - maravilhosa!!!");
			System.out.println("\n4 - legal!!!");
			System.out.println("\nDigite a sua opção: ");
			
			op = leia.nextInt();
			
		switch(op) {
		
		case 1: 
			
			System.out.println("\n1- Sensacional!!!");
			
		break;
		
		case 2: 
			
			System.out.println("\n2- Incrível!!!");
			
		break;
		
		case 3: 
			
			System.out.println("\n3- maravilhosa!!!");
			
		break;
		
		case 4: 
			
			System.out.println("\n4- legal!!!");
			
		break;
		
		default:
			
			System.out.println("\nOpção inválida!!!");
		
		}
		
	}
	
		

}
