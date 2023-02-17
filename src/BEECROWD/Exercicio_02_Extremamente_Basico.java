package BEECROWD;

import java.util.Scanner;

public class Exercicio_02_Extremamente_Basico {

	public static void main(String[] args) {
		
		// EXERCÍCIO 02 - EXTREMAMENTE BÁSICO
		
		// Leia 2 valores inteiros e armazene-os nas variáveis A e B. 
		// Efetue a soma de A e B atribuindo o seu resultado na variável X. 
		// Imprima X conforme exemplo apresentado abaixo. 
		// Não apresente mensagem alguma além daquilo que está sendo especificado e 
		// não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".

		Scanner leia = new Scanner(System.in);
		
		int a, b, soma;
		
		System.out.println("\nDigite um número: ");
		a = leia.nextInt();
		System.out.println("\nDigite um número ");
		b = leia.nextInt();
		
		soma = (a + b);
				
		System.out.println("\nX = "+soma);
		
	}
}
