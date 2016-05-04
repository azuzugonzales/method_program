package by.bsu._inet_example.beginnersbook.comparators;

import java.util.Comparator;

class Comp implements Comparator<String>{
	@Override
	public int compare(String obj1, String obj2){
		int k = obj1.substring(obj1.indexOf(" ")).compareTo(obj2.substring(obj2.indexOf(" ")));
		if(k == 0){
			return obj1.compareTo(obj2);
		} else{
			return k;
		}
	}
}