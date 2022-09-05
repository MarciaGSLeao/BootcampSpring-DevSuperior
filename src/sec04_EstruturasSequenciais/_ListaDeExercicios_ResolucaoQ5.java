package sec04_EstruturasSequenciais;

import java.util.Scanner;

public class _ListaDeExercicios_ResolucaoQ5 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("CALCULANDO O SALÁRIO:");
		
		//String codPeca1;
		double qtdPeca1;
		double valorUnitPeca1;
		//String codPeca2;
		double qtdPeca2;
		double valorUnitPeca2;
		
		//System.out.print("\nInforme o código da 1ª Peça: ");
		//codPeca1 = entrada.next();
		System.out.print("Informe a quantidade comprada da 1ª Peça: ");
		qtdPeca1 = entrada.nextDouble();
		System.out.print("Informe o preço unitário 1ª Peça: ");
		valorUnitPeca1 = entrada.nextDouble();
		//System.out.print("\nInforme o código da 2ª Peça: ");
		//codPeca2 = entrada.next();
		System.out.print("Informe a quantidade comprada da 2ª Peça: ");
		qtdPeca2 = entrada.nextDouble();
		System.out.print("Informe o preço unitário 2ª Peça: ");
		valorUnitPeca2 = entrada.nextDouble();		

		double valorAPagar = (qtdPeca1*valorUnitPeca1) + (qtdPeca2*valorUnitPeca2);
		System.out.printf("\nValor a Pagar: R$ %.2f", valorAPagar);
		
		entrada.close();
	}
}
