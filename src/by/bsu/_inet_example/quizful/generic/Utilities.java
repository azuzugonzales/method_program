package by.bsu.com._inet_example.quizful.generic;

import java.util.ArrayList;
import java.util.List;

public class Utilities {
    public static <T> void fill(List<T> list, T val){
        for (int i = 0; i < list.size(); i++)
            list.set(i, val);
    }
}

class TestUtilities{
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        System.out.println("List of processing up to generic method: " + intList);
        Utilities.fill(intList, 0);
        System.out.println("List after treatment with generic method: " + intList);
    }
}
