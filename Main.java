package m3_Activity1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	 
	public static void main(String[] args) {
		List<String> productList = new ArrayList<>(Arrays.asList("Laptop","Mouse","Keyboard","Monitor","Printer"));

		//print Products
		System.out.println("All products: ");
		displayProduct(productList);
		
		//add new Product
		productList.add("Webcam");
		
		//remove a Product
		productList.remove("Mouse");
		
		//print Products
		System.out.println("\nAfter adding and removing products: ");
		displayProduct(productList);
		
		Scanner sc = new Scanner(System.in);	
		System.out.print("\nEnter product name to search: ");
		String input = sc.nextLine();
		
		if(productList.contains(input)) 
			System.out.println("Product found: " + productList.get(productList.size() - 1));
		else
			System.out.println("Product not found");
		
		sc.close();

	}
	
	static void displayProduct(List<String> list) {
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i+1 + ". " + list.get(i));
			}
	}

}
