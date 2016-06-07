package by.bsu.com._inet_example.learningviacode.sortingenums_v2;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class RankComparatorTest{
	
	public static void main(String[] args){
		
		final List<Rank> rankList = Arrays.asList(Rank.values());


		TreeSet<Rank> ranks = new TreeSet<Rank>();
		ranks.addAll(rankList);
		
		System.out.println("--- Using the default sorting ---");
		
		for(Rank rank : ranks){
			System.out.println(rank);
		}
		
		ranks = new TreeSet<Rank>(new RankComparator());

		ranks.addAll(rankList);
		
		System.out.println("--- Using the business rules based sorting ---");
		
		for(Rank rank : ranks){
			System.out.println(rank);
		}
	}
}