package exercicios;

public class Exercicio01Strings {
	
	// FUNÇÕES IMPORTANTES PARA STRINGS.
	public static void main(String[] args) {
		
		String myName = "Márcia Araújo Gameleira de Souza Leão";
		
		System.out.println(myName.toLowerCase()); // CONVERTE TODA A STRING PARA MINÚSCULA.
		System.out.println(myName.toUpperCase()); // CONVERTE TODA A STRING PARA MAIÚSCULA.
		System.out.println(myName.trim()); // REMOVE TODOS OS ESPAÇOS. ??????????????????
		System.out.println(myName.substring(7)); // INICIA A STRING A PARTIR DE UM DETERMINADO ÍNDICE PASSADO COMO PARÂMETRO
		System.out.println(myName.substring(0, 23)); // INICIA A STRING A PARTIR DE UM DETERMINADO ÍNDICE PASSADO COMO PARÂMETRO ATÉ O FINAL TAMBÉM PARAMETRI
		System.out.println(myName.replace("z", "s")); // SUBSTITUI UM CARACTER POR OUTRO.
		System.out.println(myName.replace("de Souza Leão", "Freitas")); // SUBSTITUI UMA CADEIDA DE CARACTERES DA STRING POR OUTRA.
		System.out.println(myName.indexOf("L")); // LOCALIZA A POSIÇÃO DE UM CARACTER PASSADO COMO PARÂMETRO.
		System.out.println(myName.lastIndexOf("A")); // LOCALIZA A POSIÇÃO DO ÚLTIMO ÍNDICE DE UM CARACTER PASSADO COMO PARÂMETRO.
		
		// FAZENDO SPLIT DE UMA STRING E ARMAZENANDO AS PARTES EM UMA LISTA.
		String[] partsOfName = myName.split(" ");
		for (String string : partsOfName) {
			System.out.println(string);
		}
		
	}

}
