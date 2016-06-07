package by.bsu.com.collection._itemorder.fullitemenum;

import by.bsu.com.collection.enumcomp.ItemInterface;

public enum FullItemEnum implements ItemInterface{
	ITEM_ID(true), PRICE(false), NAME(true);
	
	private boolean ascend;

	private FullItemEnum(boolean ascend){
		this.ascend = ascend;
	}

	public boolean getAscend(){
		return ascend;
	}
}