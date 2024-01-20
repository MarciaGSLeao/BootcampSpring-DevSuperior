package exercicios;

import java.util.ArrayList;
import java.util.List;

public class Ex03Listas {
	
	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("Márcia Gameleira");
		names.add("Jonas Gameleira");
		names.add("Rubens Gameleira");

		// IMPRIME A LISTA COM TODOS OS ELEMENTOS.
		System.out.println(names);
		names.add(2, "Felipe Gameleira");
		System.out.println(names);

		for (String name : names) {
			System.out.println(name);
		}

		System.out.println("Total de elementos da lista: " + names.size());

		// FAZENDO USO DO CONCEITO DE PREDICADOS NO JAVA: UMA EXPRESSÃO LAMBDA QUE RETORNA UM VALOR VERDADEIRO.
		names.removeIf(s -> s.contains("Rubens"));
		System.out.println(names);

	}

}
