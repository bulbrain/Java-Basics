// Create a class Product to hold products, which have name (string) and price (decimal number). Read from a text 
// file named "Input.txt" a list of products. Each product will be in format name + space + price. You should hold 
// the products in objects of class Product. Sort the products by price and write them in format price + space + 
// name in a file named "Output.txt". Ensure you close correctly all used resources.

import java.io.*;
import java.util.*;

public class _09_ListOfProducts {

	public static void main(String[] args) throws Exception {
	
		ArrayList<Product> products = new ArrayList<Product>();
		try (Scanner in = new Scanner(new FileReader(
					"/home/georgi/Programming/1.1 Java/3. Java-Loops-methods-classes/src/pinput.txt"))) {
			while (in.hasNextLine()) {
				products.add(new Product(in.next(), in.nextDouble()));
			}
		}
		Collections.sort(products);
		try (BufferedWriter out = new BufferedWriter(new FileWriter(
				"/home/georgi/Programming/1.1 Java/3. Java-Loops-methods-classes/src/poutput.txt"))) {
			for (Product product : products) {
				out.write(String.format("%.2f %s", product.getPrice(), product.getName()));
				out.newLine();
			}
		}
	}
}