package sec08_POO;

import java.util.Scanner;
import entidades.Aluno;

public class Exerc05_MediaAluno {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println("Informe a nota do 1º trimestre: ");
		aluno.n1 = entrada.nextDouble();
		System.out.println("Informe a nota do 2º trimestre: ");
		aluno.n2 = entrada.nextDouble();
		System.out.println("Informe a nota do 3º trimestre: ");
		aluno.n3 = entrada.nextDouble();
		
		if (aluno.totalDePontos() >= 60) {
			System.out.printf("\nPontuação Final: %.2f", aluno.totalDePontos());
			System.out.println("\nAprovado!");
		}else {
			System.out.printf("\nPontuação Final: %.2f", aluno.totalDePontos());
			System.out.println("\nReprovado!");
			System.out.printf("\nFaltam %.2f para a pontuação mínima.", aluno.pontosFaltantes());
		}
		
		entrada.close();
	}
}
