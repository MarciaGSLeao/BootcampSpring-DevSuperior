package sec04_EstruturasSequenciais;

import java.util.Scanner;

public class _ListaDeExercicios_ResolucaoQ1 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int v1;
		int v2;
		
		System.out.println("SOMANDO DOIS NÚMEROS:");
		System.out.print("\nInforme o primeiro número: ");
		v1 = entrada.nextInt();
		System.out.print("Informe o segundo número: ");
		v2 = entrada.nextInt();
		int soma = v1 + v2;
		System.out.printf("\nA soma de %d e %d é %d.", v1, v2, soma);
		
		entrada.close();
	}
}
