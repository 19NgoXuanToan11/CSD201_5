package main;

import java.util.Scanner;
import manage.MyStack;
import menu.Menu;
import obj.Product;

public class NgoXuanToan_SE171297 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStack stack = new MyStack();
        
        Menu menu = new Menu("Product Management***************");
        menu.addNewOption("1. Add a product (price > 100)");
        menu.addNewOption("2. Print out the number of products currently");
        menu.addNewOption("3. Find a product by proID");
        menu.addNewOption("4. Print out all products");
        menu.addNewOption("5. Exist!");
        
        int choice = 0;
        
        do {
            menu.printMenu();
            choice = menu.getChoice();
            
            switch (choice) {
                case 1:
                    Product product1 = new Product("P1", "Product 1", 150.0);
                    Product product2 = new Product("P2", "Product 2", 80.0);
                    Product product3 = new Product("P3", "Product 3", 200.0);
                    stack.push(product1);
                    stack.push(product2);
                    stack.push(product3);
                    break;
                
                case 2:
                    stack.print();
                    break;
                
                case 3:
                    System.out.print("Input id to search: ");
                    String searchID = sc.nextLine();
                    stack.find(searchID);
                    break;
                    
                case 4:
                    stack.printAll();
                    break;
                    
                case 5: 
                    System.out.println("Existing...");
                    break;
            } 
        } while (choice != 5);
    }
    
}
