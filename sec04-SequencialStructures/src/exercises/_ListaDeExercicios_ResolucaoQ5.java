package exercises;

import java.util.Scanner;

public class _ListaDeExercicios_ResolucaoQ5 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("CALCULANDO O SAL�RIO:");
		
		//String codPeca1;
		double qtdPeca1;
		double valorUnitPeca1;
		//String codPeca2;
		double qtdPeca2;
		double valorUnitPeca2;
		
		//System.out.print("\nInforme o c�digo da 1� Pe�a: ");
		//codPeca1 = entrada.next();
		System.out.print("Informe a quantidade comprada da 1� Pe�a: ");
		qtdPeca1 = entrada.nextDouble();
		System.out.print("Informe o pre�o unit�rio 1� Pe�a: ");
		valorUnitPeca1 = entrada.nextDouble();
		//System.out.print("\nInforme o c�digo da 2� Pe�a: ");
		//codPeca2 = entrada.next();
		System.out.print("Informe a quantidade comprada da 2� Pe�a: ");
		qtdPeca2 = entrada.nextDouble();
		System.out.print("Informe o pre�o unit�rio 2� Pe�a: ");
		valorUnitPeca2 = entrada.nextDouble();		

		double valorAPagar = (qtdPeca1*valorUnitPeca1) + (qtdPeca2*valorUnitPeca2);
		System.out.printf("\nValor a Pagar: R$ %.2f", valorAPagar);
		
		entrada.close();
	}
}
