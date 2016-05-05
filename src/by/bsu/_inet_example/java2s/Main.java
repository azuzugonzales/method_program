package by.bsu._inet_example.java2s;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person one = new Person(Level.HIGH, "A");
        Person two = new Person(Level.MEDIUM, "B");
        Person three = new Person(Level.LOW, "C");
        Person four = new Person(Level.HIGH, "D");
        Person five = new Person(Level.MEDIUM, "E");
        Person six = new Person(Level.LOW, "F");
        Person seven = new Person(Level.LOW, "G");

        List<Person> persons = new ArrayList<Person>();
        persons.add(one);
        persons.add(two);
        persons.add(three);
        persons.add(four);
        persons.add(five);
        persons.add(six);
        persons.add(seven);

        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                if (person1.getSeverity() == person2.getSeverity()) {
                    return person1.getName().compareTo(person2.getName());
                } else {
                    return person1.getSeverity().compareTo(person2.getSeverity());
                }
            }
        });
        for (Person person : persons) {
            System.out.println(person.getName() + " " + person.getSeverity());
        }
    }
}
