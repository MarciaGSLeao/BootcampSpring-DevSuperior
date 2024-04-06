public class ExpressaoCondicionalTernaria {
    /*
    *     Expressão opcional ao if-else. Mais simples.
    *         (condicao) ? valor_se_verdadeiro : valor_se_falso
    *     Atribuímos a expressão à uma variável.
    * */

    public static void main(String[] args) {

        double preco = 15.90;
        double desconto = (preco > 20.00) ? 0.1*preco : 0.05*preco;
        double precoFinal = preco - desconto;

        System.out.printf("PREÇO: R$ %.2f%n", preco);
        System.out.printf("DESCONTO: R$ %.2f%n", desconto);
        System.out.printf("PREÇO FINAL: R$ %.2f%n",  precoFinal);

    }

}
