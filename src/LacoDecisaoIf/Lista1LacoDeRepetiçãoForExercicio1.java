package LacoDecisaoIf;

import java.util.Scanner;

public class Lista1LacoDeRepetiçãoForExercicio1 {

	public static void main(String[] args) {

		// Listas 1 - Exercício 1 - Laço de Repetição For

		Scanner leia = new Scanner(System.in);

		int x, n1, n2;

		System.out.println("Digite um número: \n");
		n1 = leia.nextInt();
		System.out.println("\nDigite outro número: \n");
		n2 = leia.nextInt();

		if (n1 < n2) {

			for (x = n1; x <= n2; x++) {

				if (x % 3 == 0 && x % 5 == 0) {

					System.out.println("\nO número: " + x + " é multiplo de 3 e 5.\n");

				}

			}
		}

		else {

			System.out.println("\nintervalo dos números inválido \n");

		}
	}
}
