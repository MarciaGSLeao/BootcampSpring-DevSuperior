package exercises;

import java.util.Scanner;

public class _ListaDeExercicios_ResolucaoQ3 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("CALCULANDO A DIFEREN�A DE UM PRODUTO:");
		
		System.out.print("Informe o primeiro n�mero: ");
		int n1 = entrada.nextInt();
		System.out.print("Informe o segundo n�mero: ");
		int n2 = entrada.nextInt();
		System.out.print("Informe o terceiro n�mero: ");
		int n3 = entrada.nextInt();
		System.out.print("Informe o quarto n�mero: ");
		int n4 = entrada.nextInt();
		
		int difProduto = (n1*n2)-(n3*n4);
		System.out.println("A diferencia do produto � " + difProduto);
		
		entrada.close();
	}
}
