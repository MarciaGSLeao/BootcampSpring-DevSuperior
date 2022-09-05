package sec04_EstruturasSequenciais;

import java.util.Scanner;

public class _ListaDeExercicios_ResolucaoQ4 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("CALCULANDO O SALÁRIO:");
		
		System.out.print("Informe seu número de matrícula: ");
		String matricula = entrada.next();
		System.out.print("Quantas horas foram trabalhadas? ");
		double horasTrabalhadas = entrada.nextDouble();
		System.out.print("Qual o valor da hora? ");
		double valorHora = entrada.nextDouble();
		
		double salario = horasTrabalhadas*valorHora;
		System.out.println("\nNúmero de matrícula: " + matricula);
		System.out.printf("Salário Bruto: R$ %.2f", salario);
		
		entrada.close();
	}
}
