package by.bsu.collection.enumcomp;

public enum ItemEnum {
    ITEM_ID(true), PRICE(false), NAME(true);

    private boolean ascend;

    private ItemEnum(boolean ascend){
        this.ascend = ascend;
    }

    public void setAscend(boolean ascend){
        this.ascend = ascend;
    }

    public boolean getAscend(){
        return ascend;
    }
}
