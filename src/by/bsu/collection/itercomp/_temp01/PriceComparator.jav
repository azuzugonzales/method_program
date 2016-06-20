package by.bsu.collection.enumcomp;

import java.util.Comparator;

public class PriceComparator implements Comparator<ItemEnum> {
    @Override
    public int compare(ItemEnum one, ItemEnum two){
        return Double.compare(two.getPrice() - one.getPrice());
    }
}

