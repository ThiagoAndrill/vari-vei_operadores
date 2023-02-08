package EntradasESaidas;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Exercício 3
		
		int td,tdh,tdm,tds;
		// t = tempo / d = duração / h = hora / m = minuto / s - segundo
		
		System.out.println("Quantos segundos durou o evento? \n");
		td = leia.nextInt();
		
		tdh = (td/3600);
		tdm = (td%3600)/60;
		tds = (td%3600)%60;
		
		System.out.println("\nSeu evento teve duração de "+tdh+" horas, "+tdm+" minutos e "+tds);
		
	}

}
