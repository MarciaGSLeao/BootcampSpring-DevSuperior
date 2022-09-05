package sec08_POO;

import java.util.Scanner;
import entidades.Funcionario;

public class Exerc04_Funcionario {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Informe os dados do funcionário: ");
		System.out.print("Nome: ");
		funcionario.nome = entrada.nextLine();
		System.out.print("Salário Bruto: ");
		funcionario.salarioBruto = entrada.nextDouble();
		System.out.print("Descontos: ");
		funcionario.descontos = entrada.nextDouble();
		
		System.out.println();
		System.out.println(funcionario.toString());
		
		System.out.println();
		System.out.println("Qual percentual de aumento deseja aplicar ao salário bruto do funcionário? ");
		double percentualAumento = entrada.nextDouble();
		funcionario.aplicarAumento(percentualAumento);
		
		System.out.println();
		System.out.println("Os dados do funcionário foram atualizados! \n");
		System.out.println(funcionario.toString());
		
		entrada.close();
	}
}
