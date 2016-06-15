package by.bsu.tasks.maintask.t3;

import java.math.BigInteger;

public class RunSumDigitsFactorial {
    // the main method this program
    public static void main(String[] args) {
        BigInteger digits = new BigInteger("1");
        // cycle, current task int i = 1
        for (int i = 1; i <= 100; i++) {
            // the result of the assignment
            digits = digits.multiply(new BigInteger(new Integer(i).toString()));
        }
        long sum = 0;
        String temp = digits.toString();
        // passage through all the numbers
        for (int i = 0; i < temp.length(); i++) {
            // the result of adding all the digits
            sum = sum + Long.parseLong("" + temp.charAt(i));
        }
        // printing result to the console
        System.out.print("Sum digits = " + sum + ".");
    }
}