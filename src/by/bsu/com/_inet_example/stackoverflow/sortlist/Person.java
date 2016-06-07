package by.bsu.com._inet_example.stackoverflow.sortlist;

public class Person {

    private int id;
    private String name, address;
    //private PersonComparator pc;

    public Person(int id, String name, String address, PersonComparator pc){
        this.id = id;
        this.name = name;
        this.address = address;
        //this.pc = pc;
    }

    /*public int compare(Person o1, Person o2){
        return pc.compare(o1, o2);
    }*/

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

}
