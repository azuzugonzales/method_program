package by.bsu._inet_example.dotnetperls.integercomparators;

import java.util.Arrays;

public class LengthComparatorRun {
	public static void main(String[] args){
		String[] array = new String[5];
		array[0] = "this";
		array[1] = "array";
		array[2] = "has";
		array[3] = "five";
		array[4] = "elements";
		
		// Sort strings by their length with this LengthComparator.
		Arrays.sort(array, new LengthComparator());
		
		// Display our results.
		for (String value : array){
			System.out.println(value);
		}
	}
}
