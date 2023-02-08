package EntradasESaidas;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Exercício 5
		
		double n1,n2,n3,p1,p2,p3,mediaFinal;
		
		System.out.println("Digite a peimeira nota: \n");
		n1 = leia.nextDouble();
		System.out.println("\nDigite a segunda nota: \n");
		n2 = leia.nextDouble();
		System.out.println("\nDigite a terceira nota: \n");
		n3 = leia.nextDouble();
		
		mediaFinal = ((n1*2)+(n2*3)+(n3*5))/10;
		
		System.out.println("A sua média final é: "+mediaFinal);

	}

}
