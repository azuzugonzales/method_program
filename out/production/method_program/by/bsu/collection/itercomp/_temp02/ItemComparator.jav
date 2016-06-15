package by.bsu.com.collection.itercomp._temp02;


import java.util.Comparator;

public class ItemComparator implements Comparator<ItemEnum>{

    private ItemEnum sortingIndex;

    public ItemComparator(ItemEnum sortingIndex){
        if (sortingIndex == null){
            throw new IllegalArgumentException();
        }
        this.sortingIndex = sortingIndex;
    }

    public ItemEnum getSortingIndex(){
        return sortingIndex;
    }

    /*@Override
    public int compare(Item one, Item two){
        switch(sortingIndex){
            case ITEM_ID:
                return one.getItemId() - two.getItemId();

            case PRICE:
                break;
            case NAME:
                break;
        }
        throw new IllegalArgumentException();
    }*/

    @Override
    public int compare(ItemEnum one, ItemEnum two) {
        switch (sortingIndex){
            case ITEM_ID:
                return one.getItemId() - two.getItemId();
            case PRICE:
                break;
            case NAME:
                break;
        }
        throw new IllegalArgumentException();
        }
    }
