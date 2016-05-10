package by.bsu.collection.itercomp._temp01;

import java.util.Comparator;

public class IdComparator implements Comparator<ItemEnum> {
    @Override
    public int compare(ItemEnum one, ItemEnum two){
        return one.getItemId() - two.getItemId();
    }
}
