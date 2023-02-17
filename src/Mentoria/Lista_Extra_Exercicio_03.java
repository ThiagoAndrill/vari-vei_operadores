package Mentoria;

import java.util.Scanner;

public class Lista_Extra_Exercicio_03 {

	public static void main(String[] args) {
		
		// Lista 01 - Exercício 03
		
		// 3. Faça um programa que leia o tempo de duração de um evento em uma fábrica expressa em segundos e 
		// mostre-o expresso em horas, minutos e segundos.
		
		Scanner leia = new Scanner(System.in);
		
		int segundos, minutos, horas, duracao;
		
		System.out.println("Digite quantos segundos durou o evento: ");
		segundos = leia.nextInt();
		
		horas = (segundos / 3600); 
		minutos = (segundos % 3600)/60; 
		segundos = (segundos % 60)%60; 
		
		System.out.println("\nSeu evento teve duração de "+horas+" horas, "+minutos+" minutos e "+segundos);
		
	}

}
