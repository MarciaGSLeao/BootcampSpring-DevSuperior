package exercicios;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		// ESTRUTURA SWITCH-CASE.
		
		Scanner sc = new Scanner(System.in);
		
		int opcao = sc.nextInt();
		String diaDaSemana;
		
		switch (opcao) {
			case 1:
				diaDaSemana = "Domingo";
				break;
			case 2:
				diaDaSemana = "Segunda-feira";
				break;
			case 3:
				diaDaSemana = "Terça-feira";
				break;
			case 4:
				diaDaSemana = "Quarta-feira";
				break;
			case 5:
				diaDaSemana = "Quinta-feira";
				break;
			case 6:
				diaDaSemana = "Sexta-feira";
				break;
			case 7:
				diaDaSemana = "Sábado-feira";
				break;
			default:
				diaDaSemana = "Valor Inválido";
				break;
		}
		
		System.out.println("Dia da Semana: " + diaDaSemana);
		
		sc.close();
		
	}

}
