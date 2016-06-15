package by.bsu.com.collection.linkedlistqueue;
import java.util.ArrayList;

public class Order extends ArrayList<Item>{
	private int orderId;
	private float price;
	
	public Order(ArrayList<Item> c){
		super (c);
	}
	
	//public Order(int orderId, ArrayList<? extends Item> c){
	public Order(int orderId, float price){
		//super (c);
		this.orderId = orderId;
		this.price = price;
	}
	
	public int getOrderId(){
		return orderId;
	}
	
	public void setOrderId(int orderId){
		this.orderId = orderId;
	}
}