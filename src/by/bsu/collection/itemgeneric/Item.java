package by.bsu.collection.itemgeneric;
public class Item{
	private int id;
	private float price;
	private String name;
	public Item(int id, float price, String name){
		this.id = id;
		this.price = price;
		this.name = name;
	}
	public int getItemId(){
		return id;
	}
	public float getPrice(){
		return price;
	}
	public String getName(){
		return name;
	}
	@Override
	public String toString(){
		return "Item [id = " + id + ", price = " + price + ", name = " + name + "]\n";
	}
}