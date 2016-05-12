package by.bsu.collection.itercomp.itercompwork1;

import java.util.Comparator;

public class ItemComparator implements Comparator<Item> {

    private Field field;

    public ItemComparator(Field field){
        this.field = field;
    }

    @Override
    public int compare(Item one, Item two){
        int comparison = 0;
        switch (field){
            case NAME1:
                comparison = one.getName().compareTo(two.getName());
            case ID1:
                comparison = one.getId() - two.getId();
        }
        return comparison;
    }
}