package by.bsu.com._inet_example.beginnersbook.comparators;

import java.util.TreeSet;
import java.util.Iterator;



public class CompRunner{
	public static void main(String[] args){
		TreeSet<String> ex = new TreeSet<String>(new Comp());
		ex.add(new String("Stive Global"));
		ex.add(new String("Stive Cooper"));
		ex.add(new String("Nancy Summer"));
		ex.add(new String("Aaron Eagle"));
		ex.add(new String("Barbara Smith"));
		
		Iterator<String> i = ex.iterator();
		while(i.hasNext()){
			String ts = i.next();
			System.out.println("Str: " + ts);
		}
	}
}