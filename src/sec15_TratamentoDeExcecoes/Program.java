package sec15_TratamentoDeExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
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
		}
		catch (InputMismatchException e){
			System.out.println("Erro no input dos dados!");
		}
		
		System.out.println("Fim do programa.");
		
		sc.close();
	}
}
