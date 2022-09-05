package sec10_ArraysEListas;

import java.util.Scanner;

public class _ListaDeExercicios_aprovados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int nAlunos;
		double media;

		System.out.print("Quantos alunos serão cadastrados? ");
		nAlunos = sc.nextInt();

		String[] alunos = new String[nAlunos];
		double[] s1 = new double[nAlunos];
		double[] s2 = new double[nAlunos];

		for (int i = 0; i < nAlunos; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %dº aluno: ", i + 1);
			System.out.print("\nNome: ");
			alunos[i] = sc.next();
			System.out.print("Nota do 1º semestre: ");
			s1[i] = sc.nextDouble();
			System.out.print("Nota do 2º semestre: ");
			s2[i] = sc.nextDouble();
		}

		System.out.println("ALUNOS APROVADOS: ");
		for (int i = 0; i < nAlunos; i++) {
			media = (s1[i] + s2[i]) / 2;
			if (media >= 6.0) {
				System.out.printf("%s\n", alunos[i]);
			}
		}

		sc.close();
	}
}
