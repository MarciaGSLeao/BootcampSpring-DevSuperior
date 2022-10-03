package exercises;

import java.io.File;
import java.util.Scanner;

public class InfoAboutFilePath {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o caminho do arquivo: ");
		String filePath = sc.nextLine();
		
		File file = new File(filePath);
		
		System.out.println();
		System.out.println("Nome do arquivo: " + file.getName());
		System.out.println("Caminho do arquivo: " + file.getParent());
		System.out.println("Caminho completo do arquivo: " + file.getPath());
		
		sc.close();
		
	}

}
