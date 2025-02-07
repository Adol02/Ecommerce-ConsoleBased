package InventoryManagementSystem;

import java.util.*;

class Management {
		List<Inventory> list = new ArrayList<>();
		public void addProduct(Inventory inv) {
			list.add(inv);
			//display();
		}
		public void removeProduct(String p_name) {
			int index = -1;
		    for (int i = 0; i < list.size(); i++) {
		        if (list.get(i).getName().equals(p_name)) {
		            index = i;
		            break;
		        }
		    }
		    if (index != -1) {
		        list.remove(index);
		        System.out.println("Product removed successfully.");
		        System.out.println("------------------------------------------");
		    } else {
		        System.out.println("Product not found.");
		        System.out.println("------------------------------------------");
		    }
			display();
		}
		public void updateQuantity(int id,double newQuantity) {
			int index = -1;
			for (int i = 0; i < list.size(); i++) {
				int a =list.get(i).getId();
		        if (a==id) {
		        	list.get(i).quantity = newQuantity;
		        	index =i;
		        	break;
		        }
		        }
				if(index ==-1) {
				System.out.println("Product not found.");
				System.out.println("------------------------------------------");
		     	}
				if(index !=-1) {
					System.out.println("Product Quantity Updated Successfully");
					System.out.println("------------------------------------------");
				}
		}
		public void display() {
			if(list.isEmpty()) {
				System.out.println("Inventory is empty");
			}
			else {
				System.out.println("------------INVENTORY---------------");
			for(Inventory e: list)
			System.out.println("PRODUCT ID"+" "+e.getId()+" "+"PRODUCT NAME"+" "+e.getName()+" "+"QUNATITY"+" " +e.getQuantity()+" "+"PRICE"+" "+e.getPrice());
			System.out.println("------------------------------------------");
			}
		}
		public void searchProduct(String p_name) {
			int index = -1;
			for (int i = 0; i < list.size(); i++) {
				if(list.get(i).getName().equals(p_name)) {
					System.out.println("Product found: ");
					System.out.println("Product Name: "+list.get(i).getName());
					System.out.println("Product ID: "+list.get(i).getId());
					System.out.println("Product Quantity: "+list.get(i).getQuantity());
					System.out.println("Product Price: "+list.get(i).getPrice());
					index =i;
					break;
				}
				}
			if(index ==-1) {
				System.out.println("Product not found.");
				System.out.println("------------------------------------------");
		     	}
			}
		void sortByName() {
			
			 Collections.sort(list);
			    System.out.println("Products sorted by name.");
			    display();
		   
		}
		
		
		
		
			
		}


