package POO;

import java.util.Scanner;

public class TestaGame {

	public static void main(String[] args) {
		
		// Instanciando um objeto da classe produto
		
		Scanner leia = new Scanner(System.in);
		String nomeDoJogo, genero, console, midia;
		double valor;
		
		for(int aux = 0; aux <2; aux++) {
		
		System.out.println("\nDigite o nome do jogo: ");
		nomeDoJogo = leia.next();
		
		System.out.println("\nDigite o genero do jogo");
		genero = leia.next();
		
		System.out.println("\nDigite o console onde irá jogar");
		console = leia.next();
		
		System.out.println("\nDigite o formato da mídia que deseja");
		midia = leia.next();
		
		System.out.println("\nDigite o valor do jogo");
		valor = leia.nextDouble();
		
		Produto jogo1 = new Produto(nomeDoJogo, genero, console, midia, valor);
		
		jogo1.visualizar();
		
		}
	}
}
