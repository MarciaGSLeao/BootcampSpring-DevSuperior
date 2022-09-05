package sec10_ArraysEListas;

public class ForEach {
	
	public static void main(String[] args) {
		
		String[] vetor = new String[] {"Maria", "Jonas", "Rubens"};
		
		// ESTRUTURA FOR EACH
		for (String elemento : vetor) {
			System.out.println(elemento);
		}
		
		System.out.println("----------------");
		
		// ESTRUTURA FOR
		for (int p=0; p < vetor.length; p++) {
			System.out.println(vetor[p]);
		}
	}
}
