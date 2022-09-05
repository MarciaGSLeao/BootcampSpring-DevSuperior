package sec04_EstruturasSequenciais;

import java.util.Scanner;

public class _ListaDeExercicios_ResolucaoQ3 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("CALCULANDO A DIFERENÇA DE UM PRODUTO:");
		
		System.out.print("Informe o primeiro número: ");
		int n1 = entrada.nextInt();
		System.out.print("Informe o segundo número: ");
		int n2 = entrada.nextInt();
		System.out.print("Informe o terceiro número: ");
		int n3 = entrada.nextInt();
		System.out.print("Informe o quarto número: ");
		int n4 = entrada.nextInt();
		
		int difProduto = (n1*n2)-(n3*n4);
		System.out.println("A diferencia do produto é " + difProduto);
		
		entrada.close();
	}
}
