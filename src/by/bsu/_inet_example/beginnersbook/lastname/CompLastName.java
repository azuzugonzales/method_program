package by.bsu._inet_example.beginnersbook.lastname;

class CompLastName implements Comparable{
	
	String str;
	int number;
	
	CompLastName(String str, int number){
		this.str = str;
		this.number = number;
	}
	@Override
	public int compareTo(Object obj){
		CompLastName entry = (CompLastName) obj;

		String str1 = str.substring(str.indexOf(" "));
		String str2 = entry.str.substring(entry.str.indexOf(" "));
		
		int result = str1.compareTo(str2);
		if(result != 0){
			return result;
		}
		result = number - entry.number;
		if(result != 0){
			return(int) result / Math.abs(result);
		}
		return 0;
	}
}