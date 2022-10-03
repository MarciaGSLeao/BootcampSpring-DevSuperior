package exercises;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadingAFile1 {
	
	public static void main(String[] args) {
		
		File file = new File("C:\\temp\\testeClassFile.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
		}catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}finally {
			if(sc != null) {
				sc.close();
			}
		}
	}
}
