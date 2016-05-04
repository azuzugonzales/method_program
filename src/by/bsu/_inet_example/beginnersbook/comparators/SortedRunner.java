package by.bsu._inet_example.beginnersbook.comparators;

import java.util.Arrays;

public class SortedRunner{
	public static void main(String[] args){
		Product[] p = new Product[3];
		
		p[0] = new Product();
		p[0].setName("Milk");
		p[0].setPrice(7.56);
		p[0].setQuantity(56);
		
		p[1] = new Product();
		p[1].setName("Coffee");
		p[1].setPrice(17.00);
		p[1].setQuantity(32);
		
		p[2] = new Product();
		p[2].setName("Tea");
		p[2].setPrice(12.50);
		p[2].setQuantity(0);
		
		System.out.println("================ no sorted ==================");
		
		for(Product i : p){
			System.out.println("Name: " + i.getName() +
								" price: " + i.getPrice() +
								" quantity: " + i.getQuantity());
		}
		
		System.out.println("================ sorted by price ============");
		
		Arrays.sort(p, new SortedByPrice());
		
		for(Product i : p){
			System.out.println("Name: " + i.getName() +
								" price: " + i.getPrice() +
								" quantity: " + i.getQuantity());
		}
		
		System.out.println("================ sorted by name =============");
		
		Arrays.sort(p, new SortedByName());
		
		for(Product i : p){
			System.out.println("Name: " + i.getName() +
								" price: " + i.getPrice() +
								" quantity: " + i.getQuantity());
		}
	}
}