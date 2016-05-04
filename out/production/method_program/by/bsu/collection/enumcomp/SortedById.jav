package by.bsu.collection.enumcomp;

import java.util.Comparator;
import by.bsu.collection.enumcomp.ItemEnum;

class SortedById implements Comparator<ItemEnum>{

    private ItemEnum sortingIndex;

    public int compare(ItemEnum id1, ItemEnum id2){
        switch(sortingIndex){
            case ITEM_ID:
                return id1 - id2;
            case PRICE:
                return compare(id2 - id1);
            case NAME:
                return id1.compareTo(id2);
            default:
                throw new EnumConstantNotPresentException(ItemEnum.class, sortingIndex.name());
        }
    }
}

