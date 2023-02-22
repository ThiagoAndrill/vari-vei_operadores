package Mentoria;

import java.util.Scanner;

public class Mentoria_Diogo_Exercicio_Vetor {

	public static void main(String[] args) {
			
		Scanner leia = new Scanner(System.in);
		
		int[] idades = new int[3];
		
		idades[0] = 28;
		idades[1] = 32;
		idades[2] = 18;
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println("\nA " + (i + 1) + "idade é: " + idades[i]);
			
		}
	}
}