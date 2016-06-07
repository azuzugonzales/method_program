package by.bsu.tasks.maintask.t1;

public class RunBracesCalculator {
    public static void main(String[] args) {

        BracesCalculator calc = new BracesCalculator();

        int numBracesSequences = calc.calculateCountOfBraces();

        System.out.println("Number of valid braces sequences = " + numBracesSequences);
    }
}