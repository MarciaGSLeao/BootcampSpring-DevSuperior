package sec05_EstruturasCondicionais;

import java.util.Scanner;

public class IfElse {
	
	public static void main(String[] args) {
		
//		Uma operadora de telefonia cobra:
//		R$ 50,00 => 100min
//		R$ 2,00 por min adicional
//		Fazer um programa para ler o total de minutos e o valor a pagar.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o total de minutos consumidos: ");
		int minutosConsumidos = entrada.nextInt();
		int valorSemExcedente = 50;
		double totalAPagar;
		
		if (minutosConsumidos <= 100) {
			System.out.printf("Você consumiu %d minutos, portanto o valor da sua conta permenece em R$ %d.", minutosConsumidos, valorSemExcedente);
		}else if (minutosConsumidos > 100) {
			totalAPagar = (valorSemExcedente + ((minutosConsumidos - 100)*2));
			System.out.printf("Você consumiu %d minutos, portanto o valor da sua conta será R$ %.2f.", minutosConsumidos, totalAPagar);
		}
		
		entrada.close();
	}
}
