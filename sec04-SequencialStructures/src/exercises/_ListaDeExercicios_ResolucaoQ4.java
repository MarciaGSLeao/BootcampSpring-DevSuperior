package exercises;

import java.util.Scanner;

public class _ListaDeExercicios_ResolucaoQ4 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("CALCULANDO O SAL�RIO:");
		
		System.out.print("Informe seu n�mero de matr�cula: ");
		String matricula = entrada.next();
		System.out.print("Quantas horas foram trabalhadas? ");
		double horasTrabalhadas = entrada.nextDouble();
		System.out.print("Qual o valor da hora? ");
		double valorHora = entrada.nextDouble();
		
		double salario = horasTrabalhadas*valorHora;
		System.out.println("\nN�mero de matr�cula: " + matricula);
		System.out.printf("Sal�rio Bruto: R$ %.2f", salario);
		
		entrada.close();
	}
}
