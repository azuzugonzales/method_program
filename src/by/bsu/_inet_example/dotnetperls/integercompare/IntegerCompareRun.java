package by.bsu.com._inet_example.dotnetperls.integercompare;

public class IntegerCompareRun {
    public static void main(String[] args) {
        System.out.println(Integer.compare(10, 1) + "  [first is larger]");
        System.out.println(Integer.compare(1, 100) + " [first is smaller]");
        System.out.println(Integer.compare(1, 1) + "  [both are equal]");
    }
}
