package sec14_HerancaEPolimorfismo.applications;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sec14_HerancaEPolimorfismo.entities.Employee;
import sec14_HerancaEPolimorfismo.entities.OutsourcedEmployee;

public class Program3_Emplloyees {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o total de empregados a cadastrar: ");
		int qtdEmp = sc.nextInt();
		
		List<Employee> listaEmp = new ArrayList<>();
		
		for(int i=1; i <= qtdEmp; i++ ) {
			System.out.println("Informações do " + i + "º empregado: " );
			System.out.print("É terceirizado (s/n)? ");
			char sn = sc.next().charAt(0);
			System.out.print("Nome do funcionário: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Total de horas trabalhadas: ");
			Integer hours = sc.nextInt();
			System.out.print("Valor da hora: ");
			Double valuePerHour = sc.nextDouble();
			if(sn == 's') {
				System.out.print("Valor do Adicional: ");
				Double additionalCharge = sc.nextDouble();
				listaEmp.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			}else {
				listaEmp.add(new Employee(name, hours, valuePerHour));	
			}
		}
		
		System.out.println();
		System.out.println("LISTA PARA PAGAMENTO: ");
		for (Employee emp : listaEmp) {
			System.out.println(emp.getName() + " - R$ " + String.format("%.2f", emp.getPayment()));
		}
		
		sc.close();
		
	}

}
