package by.bsu.com.collection.enumcomp;

import by.bsu.com.collection.lists.Item;

import java.util.Comparator;

public class ItemComparator implements Comparator<ItemEnum>{

	private ItemEnum sortingIndex;
	private ItemEnum ascend;

	public IdComparator(ItemEnum ascend){
		setAscend(ascend);
	}

	public ItemComparator(ItemEnum sortingIndex){
		setSortingIndex(sortingIndex);
	}

	public final void setAscend(ItemEnum ascend){
		if(ascend == null){
			throw new IllegalArgumentException();
		}
		this.ascend = ascend;
	}

	public final void setSortingIndex(ItemEnum sortingIndex){
		if(sortingIndex == null){
			throw new IllegalArgumentException();
		}
		this.sortingIndex = sortingIndex;
	}

	public ItemEnum getAscend(){
		return ascend;
	}

	public ItemEnum getSortingIndex(){
		return sortingIndex;
	}

	@Override
	public int compare(ItemEnum one, ItemEnum two){
		switch(sortingIndex){
			case ITEM_ID:
			return one.getId() - two.getId();
			case PRICE:
			return Double.compare(two.getPrice() - one.getPrice());
			case NAME:
			return one.getName().compareTo(two.getName());

			default:
			throw new EnumConstantNotPresentException(by.bsu.com.collection._itemorder.itemenum.ItemEnum.class, sortingIndex.name());
		}
		switch (ascend){
			case ITEM_ID:
				return one.getAscend() - two.getAscend();
			break;
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