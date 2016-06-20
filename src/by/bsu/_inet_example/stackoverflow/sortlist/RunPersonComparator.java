package by.bsu._inet_example.stackoverflow.sortlist;

import java.util.ArrayList;
import java.util.Collections;

public class RunPersonComparator {
    public static void main(String[] args) {

        ArrayList<Person> p = new ArrayList<Person>(){
            {
                /*add(new Person(1, "name1", "address1"));
                add(new Person(2, "name2", "address2"));*/

            }

        };

       /* ArrayList<Card> aCardList = new ArrayList<Card>();

        Collections.sort(aCardList, new Comparator<Card>() {

            @Override
            public int compare(Card o1, Card o2) {
                if (o1.getRank() > o2.getRank())
                    return -1;
                else if (o1.getRank() < o2.getRank())
                    return 1;
                else
                    return 0;
            }
        });*/

        Collections.sort(p, PersonComparator.ID_SORT);
        System.out.println("id: " + PersonComparator.ID_SORT);

    }
}




            /*{
                p.add(new Person(1, Ivan, Kilo, PersonComparator));
            }*/





        /*final List<Person> personsList = Arrays.asList(Person.values());

        List<Person> list = null;
        Collections.sort(list, decending(getComparator(NAME_SORT, ID_SORT)))*/
