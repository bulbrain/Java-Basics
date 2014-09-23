// Create a class Product to hold products, which have name (string) and price (decimal number). Read from a text 
// file named "Products.txt" a list of product with prices and keep them in a list of products. Each product will 
// be in format name + space + price. You should hold the products in objects of class Product. Read from a text 
// file named "Order.txt" an order of products with quantities. Each order line will be in format product + space +
// quantity. Calculate and print in a text file "Output.txt" the total price of the order. Ensure you close 
// correctly all used resources.

import java.io.*;
import java.util.*;

public class _10_OrderOfProducts {
	
	public static void main(String[] args) throws Exception {
		
		ArrayList <Product> products = new ArrayList <Product>();
		try (Scanner in = new Scanner(new FileReader(
				"/home/georgi/Programming/1.1 Java/3. Java-Loops-methods-classes/src/pinput.txt"))) {
			while (in.hasNextLine()) {
				products.add(new Product(in.next(), in.nextDouble()));
			}
		}
		double result = 0;
		try (Scanner in = new Scanner(new FileReader(
				"/home/georgi/Programming/1.1 Java/3. Java-Loops-methods-classes/src/order.txt"))) {
			while(in.hasNextLine()) {
				double quantity = in.nextDouble();
				String currentProduct = in.next();
				for (Product product : products) {
					if (product.getName().equals(currentProduct)) {
						result += quantity * product.getPrice();
					}
				}
			}
		}
		try (BufferedWriter out = new BufferedWriter(new FileWriter(
				"/home/georgi/Programming/1.1 Java/3. Java-Loops-methods-classes/src/poutput.txt"))) {
			out.write(String.format("%.2f", result));
		}
	}
}
