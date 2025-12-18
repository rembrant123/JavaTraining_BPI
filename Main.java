package m3_Activity2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> productSet = new HashSet<String>();
		
		productSet.add("Laptop");
		productSet.add("Mouse");
		productSet.add("Keyboard");
		productSet.add("Monitor");
		productSet.add("Printer");
		
		int input;
		boolean running = true;
		
		do {
			System.out.print("\nSelect an option: \n1. Seach a product\n2. Add a product\n3. Print all products and count\n4. Exit\n>"); 
			input = sc.nextInt();
			sc.nextLine();
			switch(input) {
			case 1:
				searchProduct(productSet);
				break;
			case 2:
				addProduct(productSet);
				break;
			case 3:
				displayProduct(productSet);
				break;
			case 4:
				running = false;
				System.out.println("Exiting...");
				break;
			}
		}
		while(running);
		

		sc.close();
	}

	static void searchProduct(Set<String> products) {
		System.out.print("\nEnter a product name to search: ");
		String search = sc.nextLine();
		boolean contains = products.contains(search);
		
		if (contains) {
			System.out.println("Product found: " + search);	
		}
		else
			System.out.println("Product NOT found!");	
	}
	static void addProduct(Set<String> products) {
		System.out.print("\nEnter a product name to add: ");
		String add = sc.nextLine();
		products.add(add);
		System.out.println("Product added: " + add);
	}
	static void displayProduct(Set<String> products) {
		System.out.println("All products: ");
		for (String product : products)
			System.out.println(product);
		System.out.println("Total unique products: " + products.size());
		
	}

}
