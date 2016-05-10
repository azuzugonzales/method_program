package by.bsu._inet_example.beginnersbook.comparables;

class Item implements Comparable<Item>{
	public int value;
	
	public Item(int value){
		this.value = value;
	}

	// Sort straight
	/*@Override
	public int compareTo(ItemEnum item) {
		return Integer.compare(this.value, item.value);
	}*/

	// Sort back
	@Override
	public int compareTo(Item item){
		return Integer.compare(item.value, this.value);
	}
	
	public String toString(){
		return "Value = " + value;
	}


}