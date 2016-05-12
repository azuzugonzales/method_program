package by.bsu.collection.itercomp;

public class Item {
	private int id;
	//private float price;
	private double price;
	private String name;
	public Item(int id, double price, String name){
		this.id = id;
		this.price = price;
		this.name = name;
	}
	public int getId(){
		return id;
	}
	public double getPrice(){
		return price;
	}
	public String getName(){
		return name;
	}
	@Override
	public String toString(){
		return "ItemEnum [id = " + id + ", price = " + price + ", name = " + name + "]\n";
	}
}