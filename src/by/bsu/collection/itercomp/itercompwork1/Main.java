package by.bsu.com.collection.itercomp.itercompwork1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        final Date timestamp = new Date();

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
            System.out.println(item.getId() + " time " + timestamp);

        }
    }
}
