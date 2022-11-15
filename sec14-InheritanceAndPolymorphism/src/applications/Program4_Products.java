package applications;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program4_Products {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> listaProducts = new ArrayList<>();
		
		System.out.print("informe o total de produtos a cadastrar: ");
		Integer tp = sc.nextInt();
		System.out.println();
		
		for(int i = 1; i <= tp; i++) {
			System.out.println("Dados do " + i + "º produto: ");
			System.out.print("Novo, usado ou importado (n/u/i)? ");
			char nui = sc.next().charAt(0);
			
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Preço: ");
			Double price = sc.nextDouble();
			
			if (nui == 'n') {
				listaProducts.add(new Product(name, price));
				
			} else if (nui == 'u') {
				System.out.println("Data de fabricação: ");
				String manufactureDate = sc.nextLine();
				Date date = sdf.parse(manufactureDate);
				listaProducts.add(new UsedProduct(name, price, date));
			}else {
				System.out.print("Taxa de Importação: ");
				Double customsFee = sc.nextDouble();
				listaProducts.add(new ImportedProduct(name, price, customsFee));
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("PREÇOS: ");
		
		for (Product product : listaProducts) {
			System.out.println(product.getPriceTag());
		}
		
		
		sc.close();
	}

}
