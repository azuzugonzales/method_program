package by.bsu._inet_example.byteslounge.enums;

public class Main {
    public static void main(String[] args) {

        Operation sum = new Operation(10, 5, EOperator.SUM);
        Operation subtraction = new Operation(10, 5, EOperator.SUBTRACT);


        System.out.println("Sum: " + sum.calculate());
        System.out.println("Subtraction: " + subtraction.calculate());
    }
}
