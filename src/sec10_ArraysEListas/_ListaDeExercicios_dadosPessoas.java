package sec10_ArraysEListas;

import java.util.Scanner;

public class _ListaDeExercicios_dadosPessoas {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nPessoas;
		
		System.out.print("Quantos pessoas serão informadas? ");
		nPessoas = sc.nextInt();
		
		double[] alturas = new double[nPessoas];
		char[] sexo = new char[nPessoas];
		
		for (int i=0; i<nPessoas;i++) {
			System.out.printf("Informações da %dª pessoas:", i+1);
			System.out.print("\nAltura: ");
			alturas[i] = sc.nextDouble();
			System.out.print("Gênero: ");
			sexo[i] = sc.next().charAt(0);
		}
		
		double menorAltura = alturas[0];
		double maiorAltura = alturas[0];
		for (int i=0; i<nPessoas; i++) {
			if(alturas[i] < menorAltura) {
				menorAltura = alturas[i];
			}
			if(alturas[i] > maiorAltura) {
				maiorAltura = alturas[i];
			}
		}
		
		double somaAlturaMulheres=0;
		int totalMulheres=0;
		int totalHomens=0;
		double mediaMulheres;
		for(int i=0; i<nPessoas;i++) {
			if(sexo[i] == 'F') {
				somaAlturaMulheres += alturas[i];
				totalMulheres ++;
			}else {
				totalHomens++;
			}
		}
		mediaMulheres = somaAlturaMulheres/totalMulheres;
		
		System.out.printf("MENOR ALTURA: %.2f%n", menorAltura);
		System.out.printf("MENOR ALTURA: %.2f%n", maiorAltura);
		System.out.printf("MÉDIA DAS ALTURA DAS MULHERES: %.2f%n", mediaMulheres);
		System.out.printf("TOTAL DE HOMENS: %d", totalHomens);
	
		sc.close();
	}
}
