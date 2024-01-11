package exercicios;

public class MembrosEstaticos {
	
	public static void main(String[] args) {
		
		/*
		 * Os métodos 'PI' e 'sqrt' da classe Math são exemplos
		 * de membros estáticos de classe, pois eles são chamados
		 * a parti da própria classe 'Math' sem necessidade de
		 * instanciar um objeto do tipo Math.
		 * Uma classe que possui somente membros estáticos, pode
		 * ser uma classe estática também e não pode ser instanciada.
		 */
		System.out.printf("PI = %.2f%n", Math.PI);
		System.out.printf("%.2f%n", Math.sqrt(225));
		
	}

}
