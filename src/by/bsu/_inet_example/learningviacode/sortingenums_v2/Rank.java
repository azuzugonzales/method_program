package by.bsu.com._inet_example.learningviacode.sortingenums_v2;

enum Rank{
	RANK_1(3), RANK_2(2), RANK_3(1);
	
	private final int rank;
	
	private Rank(int rank){
		this.rank = rank;
	}
	
	public int getRank(){
		return rank;
	}
}