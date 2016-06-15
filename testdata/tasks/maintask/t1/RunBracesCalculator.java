package by.bsu.tasks.maintask.t1;

public class RunBracesCalculator {
    // the main method this program
    public static void main(String[] args) {

        // create exemplar BracesCalculator
        BracesCalculator calc = new BracesCalculator();

        int numBracesSequences = calc.calculateCountOfBraces();

        // print to console
        System.out.println("Number of valid braces sequences = " + numBracesSequences);
    }
}