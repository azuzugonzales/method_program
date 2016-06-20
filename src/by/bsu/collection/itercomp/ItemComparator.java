package by.bsu.collection.itercomp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ItemComparator implements Comparator<Item>{

    public enum ItemEnum{
        ID, PRICE, NAME
    }

    private ItemEnum sortingIndex;

    public ItemComparator(ItemEnum sortingIndex){
        this.sortingIndex = sortingIndex;
    }

    @Override
    public int compare(Item one, Item two){
        int comparison = 0;
        switch (sortingIndex){
            case ID:
                comparison = one.getId() - two.getId();
            case PRICE:
                comparison = new Double(one.getPrice()).compareTo(two.getPrice());
            case NAME:
                comparison = one.getName().compareTo(two.getName());
        }
        return comparison;
    }

    public static void main(String[] args) {
        ArrayList<Item> itemAList = new ArrayList<Item>(){
            {
                add(new Item(30, 14.3, "test4"));
                add(new Item(20, 15.5, "test5"));
                add(new Item(10, 12.7, "test7"));
                add(new Item(40, 11.4, "test1"));
            }
        };

        System.out.println("=== sort by ID ===");
        Collections.sort(itemAList, new Comparator<Item>() {
            @Override
            public int compare(Item one, Item two) {
                return one.getId() - two.getId();
            }
        });

        for (Item item : itemAList){
            System.out.println(item.getId());
        }

        System.out.println("+++ sort by PRICE +++");
        Collections.sort(itemAList, new Comparator<Item>() {
            @Override
            public int compare(Item one, Item two) {
                return new Double(one.getPrice()).compareTo(two.getPrice());
            }
        });

        for (Item item : itemAList){
            System.out.println(item.getPrice());
        }

        System.out.println("@@@ sort by NAME @@@");
        Collections.sort(itemAList, new Comparator<Item>() {
            @Override
            public int compare(Item one, Item two) {
                return one.getName().compareTo(two.getName());
            }
        });

        for (Item item : itemAList){
            System.out.println(item.getName());
        }

        // TODO sort float, Object
    }
}
