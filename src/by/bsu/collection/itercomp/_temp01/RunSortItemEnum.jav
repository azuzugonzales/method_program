package by.bsu.collection.enumcomp;

import by.bsu.collection._itemorder.fullitemenum.FullItemEnum;
import by.bsu.collection._itemorder.itemenum.ItemEnum;

import java.util.ArrayList;
import java.util.Collections;

public class RunSortItemEnum {
	
	public static void main(String[] args){

		ArrayList<FullItemEnum> p = new ArrayList<FullItemEnum>(){
			{
				add(new FullItemEnum(52201, 9.75f, "T-Shirt"));
				add(new FullItemEnum(52127, 13.99f, "Dress"));
				add(new FullItemEnum(47063, 45.95f, "Jeans"));
				add(new FullItemEnum(90428, 60.9f, "Gloves"));
				add(new FullItemEnum(53295, 31f, "Shirt"));
				add(new FullItemEnum(63220, 14.9f, "Tie"));
			}
		};


		Collections.sort(p, new ItemComparator(FullItemEnum.ITEM_ID));
		for(FullItemEnum prices : p)
			System.out.println(prices);


		/*System.out.println("=== sort by price ===\n");

		Collections.sort(p, ItemEnum.comp1);
		for(FullItemEnum prices : p)
		System.out.println(prices);

		System.out.println("=== sort by price back ===\n");

		Collections.sort(p, ItemEnum.comp2);
		for(FullItemEnum prices : p)
			System.out.println(prices);*/
	}
}