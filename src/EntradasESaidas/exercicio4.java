package EntradasESaidas;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		//Exercício 4 
		
		double a,b,c,d,r,s;
		
		System.out.println("Digite o primeiro número: \n");
		a = leia.nextDouble();
		System.out.println("Digite o segundo número: \n");
		b = leia.nextDouble();
		System.out.println("Digite o terceiro número: \n");
		c = leia.nextDouble();
		
		r = Math.pow((a+b), 2);
		s = Math.pow((b+c), 2);
		
		d = (r+s)/2;
		
		System.out.println("O resultado da operação é de: \n"+d);
		
	}

}
