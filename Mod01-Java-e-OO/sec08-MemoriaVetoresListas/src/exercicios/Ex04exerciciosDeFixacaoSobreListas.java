package exercicios;

import entidades.Empregado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// CRIAR LISTA DE EMPREGADOS DE UMA EMPRESA.
public class Ex04exerciciosDeFixacaoSobreListas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos empregados serão registrados? ");
        int totalDeEmp = sc.nextInt();
        List<Empregado> empregados = new ArrayList<Empregado>();

        System.out.println();
        for (int i = 0; i < totalDeEmp; i++) {
            Empregado empregado = new Empregado();
            System.out.printf("Empregado %d:%n", i + 1);
            System.out.print("ID: ");
            empregado.setId(sc.nextInt());
            System.out.print("Nome: ");
            sc.nextLine();
            empregado.setName(sc.nextLine());
            System.out.print("Salário: ");
            empregado.setSalary(sc.nextDouble());
            empregados.add(empregado);
            System.out.println();
        }

        System.out.println("Informe o ID do empregado que terá aumento salarial: ");
        int idEscolhido = sc.nextInt();

        for (Empregado empregad : empregados) {
            if (empregad.getId() == idEscolhido){
                System.out.println("Informe o percentual de aumento: ");
                double percAum = sc.nextDouble();
                empregad.aumentoSalarial(percAum);
            }else {
                System.out.println("Funcionário não encontrado.");
            }
        }

        System.out.println();
        System.out.println("Lista de Empregados:");
        for(Empregado e : empregados){
            System.out.printf("%d, %s, %.2f%n", e.getId(), e.getName(), e.getSalary());
        }

        sc.close();

    }

}
