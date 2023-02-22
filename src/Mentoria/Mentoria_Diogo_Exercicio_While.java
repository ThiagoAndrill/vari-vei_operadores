package Mentoria;

import java.util.Scanner;

public class Mentoria_Diogo_Exercicio_While {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int idade;

		do {

			System.out.println("\nDigite a sua idade: ");
			idade = leia.nextInt();

			if (idade >= 18) {
				System.out.println("\nPode entrar!!!");

			} else if (idade < 0) {
				System.out.println("\nCê num tá bem não!!!");
				
			}else {
				System.out.println("\nMete o pé!!!");

			}
		} while (idade != -1);
	}
}