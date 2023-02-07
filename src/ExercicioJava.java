import java.util.Scanner;

public class ExercicioJava {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); 
		
		//Exercício 1
		
		float salario,abono,novoSalario;
		
		System.out.println("Digite o salário: ");
		salario = s.nextFloat();
		
		System.out.println("\nDigite o valor do abono: ");
		abono = s.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf("\nO valor do novo salário é: %.2f\n",novoSalario);
		
		
		//Exercício 2
		
		float nota1,nota2,nota3,nota4,mediaFinal;
		
		System.out.println("Digite a primeira nota: \n");
		nota1 = s.nextFloat();
		
		System.out.println("\nDigite a segunda nota: \n");
		nota2 = s.nextFloat();
		
		System.out.println("\nDigite a terceira nota: \n");
		nota3 = s.nextFloat();
		
		System.out.println("\nDigite a quarta nota: \n");
		nota4 = s.nextFloat();
		
		mediaFinal = (nota1+nota2+nota3+nota4)/4;
		
		System.out.printf("\nSua nota é: \n\n%.1f",mediaFinal);
		
		
		//Exercício 3
		
		float salarioBruto,adicionalNoturno,horasExtras,descontos,salarioLiquido;
		
		System.out.println("Digite o salario bruto: \n");
		salarioBruto = s.nextFloat();
		
		System.out.println("\nDigite o adicional noturno: \n");
		adicionalNoturno = s.nextFloat();
		
		System.out.println("\nDigite as horas extras: \n");
		horasExtras = s.nextFloat();
		
		System.out.println("\nDigite os descontos: \n");
		descontos = s.nextFloat();
		
		salarioLiquido = (salarioBruto+adicionalNoturno+horasExtras*5)-descontos;
		
		System.out.printf("\nSeu salário é: \n\n%.2f",salarioLiquido);
		
		//Exercício 4 
		
		int n1,n2,n3,n4,diferenca;
		
		System.out.println("Digite o primeiro valor: \n");
		n1 = s.nextInt();
		
		System.out.println("\nDigite o segundo valor: \n");
		n2 = s.nextInt();
		
		System.out.println("\nDigite a terceira nota: \n");
		n3 = s.nextInt();
		
		System.out.println("\nDigite a quarta nota: \n");
		n4 = s.nextInt();
		
		diferenca = (n1 * n2)-(n3*n4);
		
		System.out.println("\nA diferença é: \n\n"+diferenca);
	}

}
