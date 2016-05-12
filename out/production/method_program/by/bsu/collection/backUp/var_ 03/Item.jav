package by.bsu.collection;
import java.util.Comparator;

public class Item{
	private int id;
	private float price;
	private String name;
	
	public Item(int id, float price, String name){
		super();
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
	
	public static class IdComparator implements Comparator<Item>{
		@Override
		public int compare(Item one, Item two){
			return one.getItemId() - two.getItemId();
		}
	}
		
	public static class PriceComparator implements Comparator<Item>{
		@Override
		public int compare(Item one, Item two){
			return Double.compare(two.getPrice() - one.getPrice());
		}
	}
}