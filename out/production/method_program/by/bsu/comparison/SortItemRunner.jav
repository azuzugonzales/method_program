package by.bsu.com.comparison;

import java.util.ArrayList;
import java.util.Collections;

public class SortItemRunner{
	
	public static void main(String[] args){
		ArrayList<Item> p = new ArrayList<Item>(){
			{
				add(new Item(52201, 9.75f, "T-Shirt"));
				add(new Item(52127, 13.99f, "Dress"));
				add(new Item(47063, 45.95f, "Jeans"));
				add(new Item(90428, 60.9f, "Gloves"));
				add(new Item(53295, 31f, "Shirt"));
				add(new Item(63220, 14.9f, "Tie"));
			}
		};

		System.out.println("=== sort by price ===\n");

		Collections.sort(p, Item.comp1);
		for(Item prices : p)
		System.out.println(prices);

		System.out.println("=== sort by price back ===\n");

		Collections.sort(p, Item.comp2);
		for(Item prices : p)
			System.out.println(prices);
	}
}