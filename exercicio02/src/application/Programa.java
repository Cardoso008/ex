package application;

import java.util.Scanner;

import entities.Product;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Product prod = new Product();
		System.out.println("Enter product data");
		System.out.print("Name: ");
		prod.setName(sc.nextLine());
		System.out.print("Price: ");
		prod.setPrice = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		prod.quantity = sc.nextInt();
		
		System.out.println("\nProduct data: " + prod);
		System.out.print("\n Enter the number of products to be added in stock: ");
		int quant = sc.nextInt();
		prod.addProduct(quant);
		System.out.println("\nUpdated product data: " + prod);
		System.out.print("\nEnter the number of products to be removed from stock: ");
		quant = sc.nextInt();
		prod.removeProduct(quant);
		System.out.println("\nUpdated product data: "+ prod);
		
		sc.close();
	}

}
