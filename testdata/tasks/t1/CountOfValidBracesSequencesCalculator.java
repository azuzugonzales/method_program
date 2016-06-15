/*
package by.bsu.tasks.t1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import by.bsu.tasks.t1.exception.NegativeNumberException;


public class CountOfValidBracesSequencesCalculator {

    private List<Integer> arrayList;
    private int countBraces;

    public CountOfValidBracesSequencesCalculator(){
        // initialisation fields
        arrayList = new ArrayList<>();
        readPositiveNumberFromKeyboard();
    }

    */
/**
     * Method  calculate a count of valid braces sequences.
     * For implementation task use the Catalan's recurrence relation.
     *
     * @return count of valid braces sequences
     *//*

    public int calculateCountOfValidBracesSequences() {

        // for countBraces == 0 valid braces sequence only one
        if (countBraces == 0) {
            return 1;
        } else arrayList.add(1);

        int countSequences;

        // if countBraces >= 1 use Catalan's recurrence relation
        for (int i = 1; i <= countBraces; ++i){
            countSequences = 0;
            for(int j = 0; j < i; ++j) {
                countSequences += arrayList.get(j) * arrayList.get(i-1-j);
            }
            arrayList.add(countSequences);
        }
        return arrayList.get(countBraces);
    }

    */
/**
     * Method reading data from keyboard.
     * User must entered only a positive integer number.
     *
     * If line from keyboard isn't integer number. User get a warning massage.
     * If line from keyboard is number, but this is a negative number. User get a warning massage.
     *
     * When user entered the correct data, method save int positive number for further use
     *//*

    private void readPositiveNumberFromKeyboard(){

        int enteredNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the count of braces: ");
        while (true) {
            try {
                enteredNumber = Integer.parseInt(scanner.nextLine());
                if (enteredNumber < 0) throw new NegativeNumberException();
                break;
            } catch (NumberFormatException ex){
                System.out.print("Entered symbols isn't integer number, please enter number again: ");
                continue;
            } catch (NegativeNumberException ex) {
                System.out.print("Number must be a positive, please enter number again: ");
                continue;
            }
        }
        countBraces = enteredNumber;
    }
}
*/
