package by.bsu._inet_example.learningviacode.sortingenums_v1;

import java.util.Arrays;
import java.util.TreeSet;

public class RankEnumTest{

	public static void main(String[] args){

		TreeSet<Rank> ranks = new TreeSet<Rank>();
		ranks.addAll(Arrays.asList(Rank.values()));

		/*for(Rank rank : ranks){
			System.out.println(rank);
		}*/
		
		for(Rank rank : ranks){
			System.out.println(rank + " " + rank.ordinal());
		}
	}
}