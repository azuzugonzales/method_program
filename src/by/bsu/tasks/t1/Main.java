package by.bsu.tasks.t1;

public class Main {

    public static void main(String[] args) {

        CountOfValidBracesSequencesCalculator calc = new CountOfValidBracesSequencesCalculator();

        int numValidBracesSequences = calc.calculateCountOfValidBracesSequences();

        System.out.println("Number of valid braces sequences = " + numValidBracesSequences);
    }
}
