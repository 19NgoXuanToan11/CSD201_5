package manage;

import java.util.Scanner;
import obj.Node;
import obj.Product;

public class MyStack {
    private Scanner scanner = new Scanner(System.in);
    
    private Node head;
    private int size = 0;

    public MyStack() {

    }
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public int getSize() {
        return size;
    }

    public void push(Product product) { 
        if (product.getPrice() > 100) {
            Node newNode = new Node(product);
            newNode.next = head;
            head = newNode;
            size++;
            System.out.println("Added product successfully!");
        }
        else {
            System.out.println("Price of product must be greater than 100");
        }
    }
    
    public void print() {
        System.out.println("Number of products in stack: " + getSize());
    }
   
    public void find(String id) {
        Node current = head;
        
        while (current != null) {
            if (current.infor.getProID().equals(id)) { // infor == product
                System.out.println("Product's Information:");
                System.out.println("Product ID: " + current.infor.getProID());
                System.out.println("Product Name: " + current.infor.getProName());
                System.out.println("Product Price: " + current.infor.getPrice());
                return;
            }
            current = current.next;
        }
        System.out.println("The product does not exist!");
    }
    
    public void printAll() {
        System.out.println("All products in stack:");
        
        Node current = head;
        
        while (current != null) {
            System.out.println("Product's ID: " + current.infor.getProID());
            System.out.println("Product's name: " + current.infor.getProName());
            System.out.println("Product's price: " + current.infor.getPrice());
            System.out.println();
            current = current.next;
        }
    }
   
}
