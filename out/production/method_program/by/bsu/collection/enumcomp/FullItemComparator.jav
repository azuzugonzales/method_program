package by.bsu.collection.enumcomp;

import by.bsu.collection._itemorder.fullitemenum.FullItemEnum;
import by.bsu.collection._itemorder.itemenum.ItemEnum;

import java.util.Comparator;

public class FullItemComparator implements Comparator<FullItemEnum>{

	private ItemEnum sortingIndex;

	public ItemComparator(ItemEnum sortingIndex){
		setSortingIndex(sortingIndex);
	}

	public final void setSortingIndex(ItemEnum sortingIndex){
		if(sortingIndex == null){
			throw new IllegalArgumentException();
		}
		this.sortingIndex = sortingIndex;
	}

	public ItemEnum getSortingIndex(){
		return sortingIndex;
	}

	@Override
	public int compare(FullItemEnum one, FullItemEnum two) {
		return one.getAscend() - two.getAscend();
	}

	@Override
	public int compare(FullItemEnum one, FullItemEnum two){
		switch(sortingIndex){
			case ITEM_ID:
			return one.getItemId() - two.getItemId();
			case PRICE:
			return Double.compare(two.getPrice() - one.getPrice());
			case NAME:
			return one.getName().compareTo(two.getName());
			default:
			throw new EnumConstantNotPresentException(ItemEnum.class, sortingIndex.name());
		}
	}

	/*@Override
	public int compare(FullItemEnum one, FullItemEnum two){
		switch(sortingIndex){
			case ITEM_ID:
			return one.getItemId() - two.getItemId();
			case PRICE:
			return Double.compare(two.getPrice() - one.getPrice());
			case NAME:
			return one.getName().compareTo(two.getName());
			default:
			throw new EnumConstantNotPresentException(ItemEnum.class, sortingIndex.name());
		}
	}*/
}