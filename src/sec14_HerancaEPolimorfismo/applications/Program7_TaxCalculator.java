package sec14_HerancaEPolimorfismo.applications;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sec14_HerancaEPolimorfismo.entities.LegalPerson;
import sec14_HerancaEPolimorfismo.entities.NaturalPerson;
import sec14_HerancaEPolimorfismo.entities.TaxPayer;

public class Program7_TaxCalculator {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> listTaxPayer = new ArrayList<>();
		
		System.out.print("informe o total de contribuintes: ");
		int totalTaxPayer = sc.nextInt();
		
		for(int i=1; i<=totalTaxPayer; i++) {
			System.out.println("\nContribuinte nº " + i + ":");
			System.out.print("Pessoa Física ou Pessóa Jurídica (f/j)? ");
			char fj = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Renda Anual: ");
			Double yearIncome = sc.nextDouble();
			if(fj == 'f') {
				System.out.print("Despesas com saúde: ");
				Double healthExpend = sc.nextDouble();
				listTaxPayer.add(new NaturalPerson(name, yearIncome, healthExpend));
			}else {
				System.out.print("Total de funcionários: ");
				int totalEmployees = sc.nextInt();
				listTaxPayer.add(new LegalPerson(name, yearIncome, totalEmployees));
			}
			
		}
		
		System.out.println();
		System.out.println("IMPOSTO PAGOS: ");
		
		Double sum = 0.0;
		for (TaxPayer taxPayer : listTaxPayer) {
			System.out.printf("%s: R$ %.2f%n", taxPayer.getName(), taxPayer.getTaxPayed());
			sum += taxPayer.getTaxPayed();
		}
		
		System.out.println();
		System.out.printf("TOTAL DE IMPOSTOS PAGOS: R$ %.2f%n", sum);
		
		sc.close();
		
	}

}
