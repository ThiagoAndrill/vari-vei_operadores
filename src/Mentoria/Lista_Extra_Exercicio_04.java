package Mentoria;

import java.util.Scanner;

public class Lista_Extra_Exercicio_04 {

	public static void main(String[] args) {
		
		// Lista 01 - Exercicio 04
		
		// 4. Escreva um programa que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: 
		
		// D = R+S	  	onde	R = (A+B)²	E S = (B+C)²	
		// _________	 	
		// 	   2

		Scanner leia = new Scanner(System.in);
		
		int a, b, c, d, r, s;
		
		System.out.println("\nDigite o primeiro número: ");
		a = leia.nextInt();
		System.out.println("\nDigite o segundo número: ");
		b = leia.nextInt();
		System.out.println("\nDigite o terceiro número ");
		c = leia.nextInt();
		
		r = (a+b) * (a+b);
		s = (b+c) * (b+c);
		d = (r+s)/2;
		
		System.out.println("\nD é igual a: "+d);
		
	}

}
