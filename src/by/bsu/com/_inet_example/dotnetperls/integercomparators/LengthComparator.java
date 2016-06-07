package by.bsu.com._inet_example.dotnetperls.integercomparators;

import java.util.Comparator;

public class LengthComparator implements Comparator<String> {
	public int compare(String arg0, String arg1){
		// Use Integer.compare to compare the two Strings' lengths.
		return Integer.compare(arg0.length(), arg1.length());
	}
}
