package by.bsu.collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AlgoritmDemo {
    public static void main(String[] args) {
        Comparator<Integer> comp = new Comparator<Integer>() {

            public int compare(Integer one, Integer two) {
                return two.intValue() - one.intValue();
            }
        };
        ArrayList<Integer> list = new ArrayList<Integer>();

        Collections.addAll(list, 1, 2, 3, 4, 5);
        Collections.shuffle(list);
        print(list);

        Collections.sort(list, comp);
        print(list);

        Collections.reverse(list);
        print(list);

        Collections.rotate(list, 3);
        print(list);

        System.out.println("min: " + Collections.min(list, comp));
        System.out.println("max: " + Collections.max(list, comp));

        List<Integer> singl = Collections.singletonList(71);
        print(singl);
    }

    public static void print(List<Integer> c){
        for (int i : c){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
