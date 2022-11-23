package model.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

	List<T> list = new ArrayList<>();
	
	// Método para adicionar um novo valor à lista "list".
	public void addValue(T value) {
		list.add(value);
	}
	
	// Método para pegar o primeiro elemento da lista.
	public T getFirst() {
		if (list.isEmpty()) {
			throw new IllegalStateException("Lista vazia.");
		}
		return list.get(0);
	}
	
	// Método para imprimir a lista inteira.
	public void print() {
		System.out.print("[");
		if(!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		for(int p = 1; p < list.size(); p++ ) {
			System.out.print(", " + list.get(p));
		}
		System.out.println("]");	
	}
}
