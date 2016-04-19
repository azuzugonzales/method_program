package by.bsu.strings;
public class DemoStringBuffer{
	public static void main(String[] args){
		StringBuffer sb = new StringBuffer();
		System.out.println("length -> " + sb.length());
		System.out.println("dimention -> " + sb.capacity());
		
		sb.append("Java");
		System.out.println("string -> " + sb);
		System.out.println("length -> " + sb.length());
		System.out.println("dimention -> " + sb.capacity());
		
		sb.append("Internationalization");
		System.out.println("string -> " + sb);
		System.out.println("length -> " + sb.length());
		System.out.println("dimention -> " + sb.capacity());
		
		System.out.println("revers -> " + sb.reverse());
	}
}