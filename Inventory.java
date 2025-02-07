package InventoryManagementSystem;

import java.util.Scanner;

public class Inventory implements Comparable<Inventory>{
	String name;
    int id;
    double quantity;
    double price;
    
	public Inventory(String name,int id, double quantity, double price) {
		this.name = name;
		this.id = id;
		this.quantity = quantity;
		this.price = price;
	}
    
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public double getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Management manage = new Management();
		System.out.println("welcome to inventory system");
		System.out.println("Enter how many products");
		int count = sc.nextInt();
		for(int i=1;i<=count;i++) {
			System.out.println("Add product "+i);
			String p_name = sc.next();
			System.out.println("Enter Product ID");
			int id = sc.nextInt();
			System.out.println("Enter Quantity for "+p_name);
			double quantity = sc.nextDouble();
			System.out.println("Enter Price for "+p_name);
			double price = sc.nextDouble();
			Inventory invent = new Inventory(p_name, id,quantity, price);
			manage.addProduct(invent);
		}
		manage.display();
		
		
		while(true) {
			System.out.println("Press 1 to remove product");
			System.out.println("Press 2 to update the quantity");
			System.out.println("Press 3 to search the product");
			System.out.println("Press 4 to display the products");
			System.out.println("Press 5 to sort");
			int option = sc.nextInt();
		if(option==1) {
			System.out.println("Enter the product name to be removed");
			String p_name = sc.next();
			manage.removeProduct(p_name);
		}
		if(option==2) {
			System.out.println("Enter the product ID to update quantity");
			int id = sc.nextInt();
			System.out.println("Enter new quantity");
			double newQuantity = sc.nextDouble();
			manage.updateQuantity(id, newQuantity);
			manage.display();
		}
		if(option==3) {
			System.out.println("Enter the product name to Search");
			String p_name = sc.next();
			manage.searchProduct(p_name);
		}
		if(option==4) {
			manage.display();
		}
		if(option==5) {
			manage.sortByName();
		}
	}
	}

	 @Override
	    public int compareTo(Inventory other) {
	        return this.name.compareTo(other.getName());	  
	        }
	 //@Override
//	 public int compareTo(Inventory other) {
//	        return new Integer(this.id).compareTo(other.getId());
//	    }
}
