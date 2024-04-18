package app;

import java.util.ArrayList;
import java.util.List;

public class Listas {

    public static void main(String[] args) {
//      Não aceita tipos primitivos.
        List listaNomes = new ArrayList<>();

        listaNomes.add("João");
        listaNomes.add("Márcia");
        listaNomes.add("Helena");
        listaNomes.add("Bebê");
        listaNomes.add("Salém");
        listaNomes.add(10);

        System.out.println(listaNomes);
    }
}
