package Mentoria;

import java.util.Scanner;

public class Mentoria_Diogo_Exercicio_Matriz {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int [][] idade = new int[3][3];
		
		idade [0][0] = 28;
		idade [1][0] = 32;
		idade [2][0] = 18;
		
		for (int i = 0; i < idade.length; i++) {
			for (int j = 0; j < idade[i].length; j++) {
				System.out.println("A "+(i+1)+" idade é: "+idade[i][j]);
			}
		}
	}

}
