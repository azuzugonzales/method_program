package by.bsu.console;
import java.util.Scanner;
public class RunScanner {
	public static void main(String[] args) {
		System.out.println("Input Your name and put <Enter>:");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		System.out.println("Hello, " + name);
		scan.close();
	}
}