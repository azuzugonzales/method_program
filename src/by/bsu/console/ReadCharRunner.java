package by.bsu.com.console;
public class ReadCharRunner {
	public static void main(String[] args) {
		int x;
		try {
			x = System.in.read();
			char c = (char)x;
			System.out.println("Code char: " + c + " =" + x);
		} catch (java.io.IOException e) {
			System.err.println("Error input " + e);
		}
	}
}