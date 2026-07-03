package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		var sc = new Scanner(System.in);
		
		 System.out.println("Enter producto data:");
		 
		 System.out.println("Name: ");
		 var name = sc.nextLine();
		 
		 System.out.println("Price: ");
		 var price = sc.nextDouble();
		 
		 System.out.println("Quantity in Stock: ");
		 var quantity = sc.nextInt();
		 
		 var product = new Product(name, price, quantity);
		 
		 System.out.println(product);
		sc.close();

	}

}
