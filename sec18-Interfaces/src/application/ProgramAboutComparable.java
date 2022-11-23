package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgramAboutComparable {

	public static void main(String[] args) {
		
		List<String> employesList = new ArrayList<>();
		String path = "D:\\Marcia\\Cursos\\Udemy\\nelio-alves\\Java\\sec18-Interfaces\\employees.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String name = br.readLine();
			while (name != null) {
			employesList.add(name);
			name = br.readLine();
			}
			
			Collections.sort(employesList);
			for (String s : employesList) {
				System.out.println(s);
			}
			
		}catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
