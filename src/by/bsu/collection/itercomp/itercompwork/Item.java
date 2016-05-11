package by.bsu.collection.itercomp.itercompwork;

public class Item {
    /*private Integer id;
    private Date timestamp;*/

    private int id;
    private String name;

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    /*public Integer getId(){
        return id;
    }*/
}
