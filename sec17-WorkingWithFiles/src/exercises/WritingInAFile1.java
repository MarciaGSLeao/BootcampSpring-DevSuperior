package exercises;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingInAFile1 {
	
	public static void main(String[] args) {
		
		String[] lines = {"Márcia", "João", "Felipe"};
		String path = "C:\\temp\\writingInAFile.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			
			for (String line : lines) {
				bw.write(line + "\n");
//				bw.newLine();
			}
		}catch(IOException e) {
			e.getStackTrace();
		}		
	}
}
