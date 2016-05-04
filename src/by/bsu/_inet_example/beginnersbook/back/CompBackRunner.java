package by.bsu._inet_example.beginnersbook.back;

import java.util.TreeSet;

public class CompBackRunner{
	
	public static void main(String[] args){
		TreeSet<CompBack> ex = new TreeSet<CompBack>();
		ex.add(new CompBack("Stive Global", 121));
		ex.add(new CompBack("Stive Global", 221));
		ex.add(new CompBack("Nancy Summer", 3213));
		ex.add(new CompBack("Aaron Eagle", 3123));
		ex.add(new CompBack("Barbara Smith", 88786));
		
		for(CompBack e : ex){
			System.out.println("Str: " + e.str + ", number: " + e.number);
		}
	}
}