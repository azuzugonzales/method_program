package by.bsu.collection;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class FindOrder{
	
	public List<Order> findBiggerAmountOrder(float bigAmount, List<Order> orders){
		
		ArrayList<Order> bigPrices = new ArrayList<Order>();
		Iterator<Order> it = orders.iterator();
		
		while(it.hasNext()){
			Order current = it.next();
			
			if(current.getAmount() >= bigAmount){
				bigPrices.add(current);
			}
		}
		return bigPrices;
	}
}