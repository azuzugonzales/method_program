package by.bsu._inet_example.beginnersbook.back;

class CompBack implements Comparable{
	
	String str;
	int number;
	
	CompBack(String str, int number){
		this.str = str;
		this.number = number;
	}
	@Override
	public int compareTo(Object obj){
		CompBack entry = (CompBack) obj;
		
		int result = entry.str.compareTo(str);
		if(result != 0){
			return result;
		}
		result = entry.number - number;
		if(result != 0){
			return(int) result / Math.abs(result);
		}
		return 0;
	}
}