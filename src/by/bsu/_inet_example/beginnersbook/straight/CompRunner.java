package by.bsu._inet_example.beginnersbook.straight;

import java.util.TreeSet;

public class CompRunner{
	
	public static void main(String[] args){
		TreeSet<Comp> ex = new TreeSet<Comp>();
		ex.add(new Comp("Stive Global", 121));
		ex.add(new Comp("Stive Global", 221));
		ex.add(new Comp("Nancy Summer", 3213));
		ex.add(new Comp("Aaron Eagle", 3123));
		ex.add(new Comp("Barbara Smith", 88786));
		
		for(Comp e : ex){
			System.out.println("Str: " + e.str + ", number: " + e.number);
		}
	}
}