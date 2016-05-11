package by.bsu.collection.itercomp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Item> itemList = new ArrayList<Item>(){
            {
                add(new Item(30, "test3"));
                add(new Item(10, "test1"));
                add(new Item(40, "test4"));
                add(new Item(50, "test5"));
                add(new Item(20, "test2"));
            }
        };

        System.out.println("=== sort by ID ===");
        Collections.sort(itemList, new Comparator<Item>() {
            @Override
            public int compare(Item one, Item two) {
                return one.getId() - two.getId();
            }
        });

        for(Item item : itemList){
            System.out.println(item.getId());
        }
    }
}
