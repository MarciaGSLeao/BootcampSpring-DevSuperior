package sec15_TratamentoDeExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		
		method1();
		
		System.out.println("Fim do programa.");
		
	}
	
	public static void method1() {
		System.out.println("***INÍCIO DO MÉTODO 1");
		
		method2();
		
		System.out.println("***FIM DO MÉTODO 1");
		
	}
	
	public static void method2() {
		System.out.println("***INÍCIO DO MÉTODO 2");

		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Informe os nomes dos convidados: ");
			String[] vect = sc.nextLine().split(" ");
			
			System.out.print("Qual a posição deseja visualizar? ");
			int position = sc.nextInt();
			
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição não existente!");
			e.printStackTrace();
			
		}
		catch (InputMismatchException e){
			System.out.println("Erro no input dos dados!");
			e.printStackTrace();
		}
		
		sc.close();
		
		System.out.println("***FIM DO MÉTODO 2");
	}
}
