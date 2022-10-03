package exercises;

import java.io.File;
import java.util.Scanner;

public class WorkingWithFolders {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o caminho da pasta: ");
		String folderPath = sc.nextLine();
		
		File path = new File(folderPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("\nDIRETÓRIOS: ");
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("\nARQUIVOS: ");
		for(File file : files) {
			System.out.println(file);
		}
		
//		// CRIANDO UMA SUBPASTA NO DIRETÓRIO A PARTIR DO JAVA
//		boolean done = new File(folderPath + "\\Nova Pasta").mkdir();
//		System.out.println("Pasta criada com sucesso!");
		sc.close();
		
	}

}
