package EntradasESaidas;

import java.util.Scanner;

public class exercício1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Exercício 1 
		
		int idade,mes,dias,diasDeVida;
		
		System.out.println("Quantos anos você tem?\n");
		idade = leia.nextInt();
		System.out.println("\nE quantos meses?\n");
		mes = leia.nextInt();
		System.out.println("\nE quantos dia?:\n");
		dias = leia.nextInt();
		
		diasDeVida = (idade * 365)+(mes * 30)+dias;
		
		System.out.println("\nVocê já viveu dias "+diasDeVida+" de vida!!!");
		
	}

}
