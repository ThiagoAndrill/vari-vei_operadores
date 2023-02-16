package Mentoria;

import java.util.Scanner;

public class Lista01_Exercicio02 {

	public static void main(String[] args) {
		// Lista 01 - Exercício 02
		
		//2. Faça um programa que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, 
		//meses e dias (considere que: 1 ano = 365 dias / 1 mês = 30 dias e 1 dia = 1 dia em todos os casos).
		
		Scanner leia = new Scanner(System.in);
		
		int idade, dias, mes, anos;
		
		System.out.println("Quantos dias você já viveu: ");
		idade = leia.nextInt();
		
		anos = (idade / 365);
		mes = (idade % 365)/30;
		dias = (idade % 365)%30;
				
		System.out.println("Você tem "+anos+" anos, "+mes+" meses e "+dias+" vividos.");

	}

}
