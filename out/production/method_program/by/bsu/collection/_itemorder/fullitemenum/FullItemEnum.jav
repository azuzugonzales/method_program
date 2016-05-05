package by.bsu.collection._itemorder.fullitemenum;

import by.bsu.collection.enumcomp.ItemInterface;

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