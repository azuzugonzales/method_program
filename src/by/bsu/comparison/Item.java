package by.bsu.comparison;

import java.util.Comparator;

public class Item{
	
	private int itemId;
	private float price;
	private String name;
	
	public Item(int itemId, float price, String name){
		this.itemId = itemId;
		this.price = price;
		this.name = name;
	}
	
	public int getItemId(){
		return itemId;
	}
	
	public void setItemId(int ItemId){
		this.itemId = itemId;
	}
	
	public float getPrice(){
		return price;
	}
	
	public void setPrice(float price){
		this.price = price;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}


	public static Comparator<Item> comp1 = new Comparator<Item>(){

		public int compare(Item i1, Item i2){

			float price1 = i1.getPrice();
			float price2 = i2.getPrice();

			return (int) (price2 - price1);
		}
	};

	public static Comparator<Item> comp2 = new Comparator<Item>(){

		public int compare(Item i1, Item i2){

			float price1 = i1.getPrice();
			float price2 = i2.getPrice();

			return (int) (price1 - price2);
		}
	};

	@Override
	public String toString(){
		return "ItemEnum [itemId = " + itemId + ", price = " + price + ", name = " + name + "]\n";
	}
}