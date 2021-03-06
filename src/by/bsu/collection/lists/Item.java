package by.bsu.collection.lists;
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
	public float getPrice(){
		return price;
	}
	public String getName(){
		return name;
	}
	@Override
	public String toString(){
		return "ItemEnum [itemId = " + itemId + ", price = " + price + ", name = " + name + "]\n";
	}
}