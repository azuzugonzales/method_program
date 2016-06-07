package by.bsu.com._inet_example.beginnersbook.lastname;

import java.util.TreeSet;

public class CompLastNameRunner{
	
	public static void main(String[] args){
		TreeSet<CompLastName> ex = new TreeSet<CompLastName>();
		ex.add(new CompLastName("Stive Global", 121));
		ex.add(new CompLastName("Stive Global", 221));
		ex.add(new CompLastName("Nancy Summer", 3213));
		ex.add(new CompLastName("Aaron Eagle", 3123));
		ex.add(new CompLastName("Barbara Smith", 88786));
		
		for(CompLastName e : ex){
			System.out.println("Str: " + e.str + ", number: " + e.number);
		}
	}
}