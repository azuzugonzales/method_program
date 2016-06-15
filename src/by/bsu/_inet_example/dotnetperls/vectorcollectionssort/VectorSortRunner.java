package by.bsu.com._inet_example.dotnetperls.vectorcollectionssort;

import java.util.Collections;
import java.util.Vector;

public class VectorSortRunner {
    public static void main(String[] args) {

        // Create Vector of three values.
        Vector<Integer> values = new Vector<>();
        values.add(10);
        values.add(1);
        values.add(100);

        //Sort elements in vector.
        Collections.sort(values);

        // Display results.
        for (int value  : values){
            System.out.println(value);
        }
    }
}
