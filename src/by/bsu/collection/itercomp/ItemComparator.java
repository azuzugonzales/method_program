package by.bsu.collection.itercomp;

public class ItemComparator {

    private Field field;

    public ItemComparator(Field field){
        this.field = field;
    }

    //@Override
    public int compare(Item one, Item two){
        int comparison = 0;
        switch (field){
            case NAME:
                comparison = one.getName().compareTo(two.getName());
            case ID:
                comparison = one.getId() - two.getId();
        }
        return comparison;
    }
}