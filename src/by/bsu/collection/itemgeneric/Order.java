package by.bsu.collection.itemgeneric;

public class Order{
	private int orderId;
	private float amount;
	public Order(int orderId, float amount){
		this.orderId = orderId;
		this.amount = amount;
	}
	public int getOrderId(){
		return orderId;
	}
	public float getAmount(){
		return amount;
	}
	@Override
	public String toString(){
		return "Order [orderId =" + orderId + ", amount = " + amount + "]";
	}
}
//===================================================
/*import java.util.Iterator;
import java.util.List;
import java.util.Collections;

public class Order implements Iterable<Item>{
	private int orderId;
	private List<Item> listItems;

	public Order(int orderId, List<Item> listItems){
		this.orderId = orderId;
		this.listItems = listItems;
	}
	public int getOrderId(){
		return orderId;
	}
	public List<Item> getListItems(){
		return Collections.unmodifiableList(listItems);
	}
	public boolean add(Item e){
		return listItems.add(e);
	}
	public Item get(int index){
		return listItems.get(index);
	}
	public Item remove(int index){
		return listItems.remove(index);
	}
	@Override
	public Iterator<Item> iterator(){
		return listItems.iterator();
	}
}*/

//===================================
/*
import java.util.ArrayList;

public class Order extends ArrayList<Item>{
	private int orderId;

	public Order(ArrayList<Item> c){
		super (c);
	}

	public Order(int orderId, ArrayList<? extends Item> c){
		super (c);
		this.orderId = orderId;
	}

	// Constructor
	*/
/*public Order(int orderId, double v) {
		this.orderId = orderId;
		this.v = v;
	}*//*


	public int getOrderId(){
		return orderId;
	}

	public void setOrderId(int orderId){
		this.orderId = orderId;
	}
}*/
