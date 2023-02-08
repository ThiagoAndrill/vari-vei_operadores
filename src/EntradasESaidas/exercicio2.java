package EntradasESaidas;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Exercício 2 
		
		int idade,mes,dia,dias;
				
		System.out.println("Quantos dias de vida você tem? \n");
		dias = leia.nextInt();

		idade = (dias / 365); //Resulta em anos
		mes = (dias % 365)/30; //Resulta em meses
		dia = (dias % 365)%30;
		
		System.out.println("\nvocê tem "+idade+" anos, "+mes+" meses e "+dia+" dias de vida!!!");

	}

}
