package by.bsu.maps;

import java.util.*;

public class DemoHashMap{
	public static void main(String[] args){
		HashMap<String, Integer> hm = new HashMap<String, Integer>(3){
			{
				this.put("Cheese", 3);
				this.put("Cake", 5);
				this.put("Milk", 1);
				this.put("Bread", 1);
			}
		};
		/*if(!hm.containsKey("Cake")){
			hm.put("Cake", 4);
		}*/
		
		System.out.println(hm);
		hm.put("Cake", 4);
		System.out.println(hm + " after replacing the element");
		Integer a = hm.get("Bread");
		System.out.println(a + " - found on a key 'Bread'");
		Set<Map.Entry<String, Integer>> setv = hm.entrySet();
		System.out.println(setv);
		Iterator<Map.Entry<String, Integer>> i = setv.iterator();
		while(i.hasNext()){
			Map.Entry<String, Integer> me = i.next();
			System.out.println(me.getKey() + " : " + me.getValue());
		}
		Set<Integer> val = new HashSet<Integer>(hm.values());
		System.out.println(val);
	}
}