package m3_group_activity1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CashierQueue {
	
    private final Queue<Product> queue = new LinkedList<>();
    private double totalBill = 0.0;
    public Scanner sc = new Scanner(System.in);
    
    public void start() {
     
        int choice;
        do {
            displayMenu();
            choice = validateChoice(sc);
            switch (choice) {
                case 1:
                	addProduct(sc);
                	break;
                case 2:
                	processNextProduct();
                	break;
                case 3:
                	checkNumberOfProducts();
                	break;
                case 4:
                	viewTotalBillSoFar();
                	break;
                case 5:
                	exitAndShowFinalBill();
                	break;
                default:
                	System.out.println("Invalid choice. Please select 1-5.");
            }
        } while (choice != 5);
        sc.close();
    }


    private void displayMenu() {
        System.out.println("--- Cashier Checkout Menu ---\n"
        		+ "1. Add a product\n"
                + "2. Process next product\n"
                + "3. Check number of products\n"
                + "4. View total bill so far\n"
                + "5. Exit");
    }
    
    public void initializeProducts() {
        queue.offer(new Product("Laptop", 50000));      
        queue.offer(new Product("Headphones", 1500));
        queue.offer(new Product("Mouse", 500));
        queue.offer(new Product("Keyboard", 800));
        queue.offer(new Product("Monitor", 2000));
    }


    private void addProduct(Scanner scanner) {
        System.out.print("Enter product name: ");
        String name = sc.nextLine().trim();

        double price = validatePrice(scanner, 0.0);

        Product p = new Product(name.isEmpty() ? "Unnamed Product" : name, price);
        queue.offer(p); 
        
        System.out.println("Product added to checkout line!");
    }

    private void processNextProduct() {
        if (queue.isEmpty()) {
            System.out.println("\nQueue is empty. No products to process.");
            return;
        }
        Product nextProduct = queue.poll(); 
        totalBill += nextProduct.getPrice();
        System.out.printf("\nProcessed: %s%n", nextProduct.getName() + " (₱ " + nextProduct.getPrice() + ")");
        System.out.printf("Total bill so far: ₱ %.2f%n", totalBill);
    }


    private void checkNumberOfProducts() {
        int count = queue.size();
        System.out.printf("\nProducts waiting in queue: %d%n", count);
    }


    private void viewTotalBillSoFar() {
        System.out.printf("\nTotal bill so far: ₱ %.2f%n", totalBill);
    }


    private void exitAndShowFinalBill() {
        System.out.println("\nClosing cashier line...");
        System.out.printf("Final total bill: ₱ %.2f%n", totalBill);
    }

    private int validateChoice(Scanner sc) {
    	System.out.print("Enter choice: ");
        String input = sc.nextLine().trim();
            
        if(Character.isDigit(input.charAt(0)) & input.length() == 1)
                return Integer.parseInt(input);
        else
                System.out.println("\nPlease enter a valid whole number.");
		return 0;
    }


    private double validatePrice(Scanner scanner, double min) {
        while (true) {
            System.out.println("Enter product price (₱): ");
            String price = scanner.nextLine().trim();
            try {
                double value = Double.parseDouble(price);
                if (value < min) {
                    System.out.printf("Value must be >= %.2f.%n", min);
                    continue;
                }
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number (e.g., 150 or 150.00).");
            }
        }
    }

}

