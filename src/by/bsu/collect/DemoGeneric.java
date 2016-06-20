package by.bsu.collect;
import java.util.ArrayList;
public class DemoGeneric{
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<>();
		list.add("Java");
		list.add("JavaFX 2");
		String res = list.get(0);
		System.out.print(list);
	}
}