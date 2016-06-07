package by.bsu.com._inet_example.learningviacode.sortingenums_v2;

import java.util.Comparator;

class RankComparator implements Comparator<Rank> {
	
	@Override
	public int compare(Rank o1, Rank o2){
		return o1.getRank() - o2.getRank();
	}
}