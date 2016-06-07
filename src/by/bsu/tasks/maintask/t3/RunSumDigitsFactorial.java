package by.bsu.tasks.maintask.t3;

import java.math.BigInteger;

public class RunSumDigitsFactorial {
    public static void main(String[] args) {
        BigInteger digits = new BigInteger("1");
        for (int i = 1; i <= 100; i++) {    // cycle, current task int i = 1
            digits = digits.multiply(new BigInteger(new Integer(i).toString()));    // the result of the assignment
        }
        long sum = 0;
        String temp = digits.toString();
        for (int i = 0; i < temp.length(); i++) {   // passage through all the numbers
            sum = sum + Long.parseLong("" + temp.charAt(i));    // the result of adding all the digits
        }
        System.out.print("Sum digits = " + sum + ".");  // printing result to the console
    }
}