package by.bsu.collection.itercomp._temp02;

import java.util.Comparator;

public class Item {
    private int itemId;
    private float price;
    //private double price;
    private String name;
    public Item(int itemId, float price, String name){
        this.itemId = itemId;
        this.price = price;
        this.name = name;
    }
    public int getItemId(){
        return itemId;
    }
    public double getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }

    public class IdComparator implements Comparator<ItemEnum> {
        @Override
        public int compare(ItemEnum one, ItemEnum two){
            int itemId1 = one.getItemId();
            int itemId2 = two.getItemId();

            return (itemId1 - itemId2);
            //return one.getItemId() - two.getItemId();
        }
    }

    public class PriceComparator implements Comparator<ItemEnum> {
        @Override
        public int compare(ItemEnum one, ItemEnum two){
            float price1 = one.getPrice();
            float price2 = two.getPrice();

            return (int) (price1 - price2);
        }
    }


}
