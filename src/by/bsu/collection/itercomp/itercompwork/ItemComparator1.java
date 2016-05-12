package by.bsu.collection.itercomp.itercompwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ItemComparator1 implements Comparator<Item> {

    public enum Field {
        ID, NAME, /*TIMESTAMP*/
    }

    private Field field;

    public ItemComparator1(Field field) {
        this.field = field;
    }

    @Override
    public int compare(Item one, Item two) {
        int comparison = 0;
        switch(field) {
            //case TIMESTAMP:
            case NAME:
                comparison = one.getName().compareTo(two.getName());
            case ID:
                comparison = one.getId() - two.getId();
            /*case TIMESTAMP:
                comparison = one.getTimestamp().compareTo(two.getTimestamp());*/
        }
        return comparison;
    }

    public static void main(String[] args) {
        ArrayList<Item> itemList = new ArrayList<Item>(){
            {
                add(new Item(30, "test4"));
                add(new Item(20, "test5"));
                add(new Item(10, "test7"));
                add(new Item(40, "test1"));
            }

        };

        System.out.println("=== sort by ID ===");
        Collections.sort(itemList, new Comparator<Item>() {
            @Override
            public int compare(Item one, Item two) {
                return one.getId() - two.getId();
            }
        });

        for (Item item : itemList){
            System.out.println(item.getId());
        }

        System.out.println("=== sort by NAME ===");
        Collections.sort(itemList, new Comparator<Item>() {
            @Override
            public int compare(Item one, Item two) {
                return one.getName().compareTo(two.getName());
            }
        });

        for (Item item : itemList){
            System.out.println(item.getName());
        }

        //System.out.println(new ArrayList<Item>());

        /*  WORK  Comparator<Item> idComp = new Comparator<Item>() {
            @Override
            public int compare(Item one, Item two) {
                return one.getID() - two.getID();
            }
        };*/

        /*Collections.sort(p, new ItemComparator1(Field.ID){
            for(Item item : p){

            }

        });*/
    }
}

       //Collections.sort(itemList, new ItemComparator1());










