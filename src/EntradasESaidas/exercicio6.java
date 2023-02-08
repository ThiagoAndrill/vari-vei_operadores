package EntradasESaidas;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Exercício 6
		
		double p1,p2,distancia,x1,x2,y1,y2;
		
		System.out.println("Digite o valor de X1: \n");
		x1 = leia.nextDouble();
		System.out.println("\nDigite o valor de X2 ");
		x2 = leia.nextDouble();
		System.out.println("\nDigite o valor de Y1: \n");
		y1 = leia.nextDouble();
		System.out.println("\nDigite o valor de y2: \n");
		y2 = leia.nextDouble();
		
		p1 = Math.pow((x2 - x1), 2);
		p2 = Math.pow((y2 - y1), 2);
		
		distancia = Math.sqrt(p1+p2);
		
		System.out.printf("\nO resultado da operação é: %.2f\n",distancia);
		
		
		
		
	}

}
