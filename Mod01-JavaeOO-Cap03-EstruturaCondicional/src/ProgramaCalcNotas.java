import java.util.Scanner;

public class ProgramaCalcNotas {

    public static void main(String[] args) {

        double notaS1;
        double notaS2;
        double media;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a nota do 1º semestre: ");
        notaS1 = sc.nextDouble();
        System.out.println("Informe a nota do 2º semestre: ");
        notaS2 = sc.nextDouble();
        media = (notaS1 + notaS2)/2;

        if(media < 6.0){
            System.out.printf("NOTA FINAL: %.2f%n", media);
            System.out.println("SITUAÇÃO: Reprovado.");
        }else{
            System.out.printf("NOTA FINAL: %.2f%n", media);
            System.out.println("SITUAÇÃO: Aprovado.");
        }

        sc.close();

    }
}
