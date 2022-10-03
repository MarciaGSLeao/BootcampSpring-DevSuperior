package challenge.app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import challenge.entities.Product;

public class MainProgram {
	
	public static void main(String[] args) {
		
		String filePath = "C:\\temp\\products.csv";
		String newFilePath = "C:\\temp\\productsOut.csv";
		
		List<Product> listProduct = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(filePath));
			 BufferedWriter bw = new BufferedWriter(new FileWriter(newFilePath, true))){
			
			String line = br.readLine();
			
			while(line != null) {
				String[] productS = line.split(",");
				String description = productS[0];
				Double price = Double.parseDouble(productS[1]);
				Integer qtd = Integer.parseInt(productS[2]);
				listProduct.add(new Product(description, price, qtd));
				line = br.readLine();
			}
			
			for(Product product: listProduct) {
				bw.write(product.getDescription() + "," + (product.getPrice()*product.getQtd()));
				bw.newLine();
			}			
		}catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
