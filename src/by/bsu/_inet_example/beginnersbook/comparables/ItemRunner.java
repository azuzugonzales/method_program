package by.bsu._inet_example.beginnersbook.comparables;

import java.util.Arrays;

public class ItemRunner {

	public static void main(String[] args) {

		// Create array of four Item objects.
		Item[] items = new Item[4];
		items[0] = new Item(100);
		items[1] = new Item(0);
		items[2] = new Item(200);
		items[3] = new Item(50);

		//Sort the Items with their Comarable interface methods.
		Arrays.sort(items);

		// Display our results.
		for (Item element : items) {
			System.out.println(element);
		}
	}
}