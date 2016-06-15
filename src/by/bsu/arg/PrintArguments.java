package by.bsu.com.arg;
public class PrintArguments {
	public static void main(String[] args) {
		for (String str : args) {
			System.out.printf("Argument-> %s%n", str);
		}
	}	
}