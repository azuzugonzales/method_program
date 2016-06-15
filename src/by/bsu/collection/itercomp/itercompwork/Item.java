package by.bsu.com.collection.itercomp.itercompwork;

public class Item {
    /*private Integer id;
    private Date timestamp;*/

    private int id;
    private String name;
    /*private Date timestamp;*/

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
        /*this.timestamp = timestamp;*/
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    /*public Date getTimestamp(){
        return timestamp;
    }*/

    /*public Integer getId(){
        return id;
    }*/
}
