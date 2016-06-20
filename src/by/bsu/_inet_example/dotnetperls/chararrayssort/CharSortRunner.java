package by.bsu._inet_example.dotnetperls.chararrayssort;

import java.util.Arrays;

public class CharSortRunner {

    static String alphabetize(String value){
        // Convert String to array and sort its elements.
        char[] values = value.toCharArray();
        Arrays.sort(values);
        return new String(values);
    }

    public static void main(String[] args) {

        // Alphabetize this String.
        System.out.println(alphabetize("zac"));
    }
}
