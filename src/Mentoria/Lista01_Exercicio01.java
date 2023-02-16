package Mentoria;

import java.util.Scanner;

public class Lista01_Exercicio01 {

	public static void main(String[] args) {
		
		// Lista 01 - Exercício 01
		
		// 1. Faça um programa que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. 
		
		Scanner leia = new Scanner(System.in);
		
		int dias, meses, idade, diasDeVida;
		
		System.out.println("\nQuantos anos você tem: ");
		idade = leia.nextInt();
		System.out.println("\nQuantos meses de vida você tem ");
		meses = leia.nextInt();
		System.out.println("\nQuantos dias você tem ");
		dias = leia.nextInt();
		
		
		diasDeVida = (idade * 365) + (meses * 30) + dias;
		
		System.out.println("\nVocê já viveu "+diasDeVida+" dias de vida");

	}

}
