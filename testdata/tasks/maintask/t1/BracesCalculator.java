package by.bsu.tasks.maintask.t1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import by.bsu.tasks.maintask.t1.exception.NegativeNumberException;

public class BracesCalculator {
    private List<Integer> arrayList;
    private int countBraces;

    // constructor
    public BracesCalculator() {
        // initialisation fields
        arrayList = new ArrayList<>();
        readFromKeyboard();
    }

    // method  calculate a count of valid braces sequences
    public int calculateCountOfBraces() {
        // for countBraces == 0 valid braces sequence only one
        if (countBraces == 0) {
            return 1;
        } else arrayList.add(1);

        int countSequences;

        // if countBraces >= 1 use Catalan's recurrence relation
        for (int i = 1; i <= countBraces; i++) {
            countSequences = 0;
            for (int j = 0; j < i; ++j) {
                countSequences += arrayList.get(j) * arrayList.get(i - 1 - j);
            }
            arrayList.add(countSequences);
        }
        return arrayList.get(countBraces);
    }

    // method reading data from keyboard
    private void readFromKeyboard() {
        int enteredNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the count of braces: ");
        while (true) {
            try {
                enteredNumber = Integer.parseInt(scanner.nextLine());
                if (enteredNumber <= 0) throw new NegativeNumberException();
                break;
            } catch (NumberFormatException e) {
                System.out.print("Entered symbol isn't integer number, please enter number again: ");
                continue;
            } catch (NegativeNumberException e) {
                System.out.print("Number must be a positive, please enter number again: ");
                continue;
            }
        }
        countBraces = enteredNumber;
    }
}