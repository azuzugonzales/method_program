package by.bsu.com._inet_example.quizful.generic;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    static void printList(List<?> list) {
        for (Object l : list)
            System.out.println("{" + l + "}");
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(100);
        printList(list);
        List<String> strList = new ArrayList<>();
        strList.add("10t");
        strList.add("100t");
        printList(strList);
    }
}




