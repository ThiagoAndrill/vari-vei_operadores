package Mentoria;

import java.util.Scanner;

public class Mentoria_Diogo_Exercicio_if_else {

	public static void main(String[] args) {
			
		// VERIFICAÇÃO DE IDADE
		
		Scanner leia = new Scanner(System.in);
		
		int idade; 
		
		System.out.println("\nDigite a sua idade: ");
		idade = leia.nextInt();
		
		if (idade >= 18)	{
			System.out.println("\nPode entrar!!!");
			
		} else {
			System.out.println("\nVai entrar não");
			
		}
	}
}
