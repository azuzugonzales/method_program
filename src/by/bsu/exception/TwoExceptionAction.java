package by.bsu.com.exception;
public class TwoExceptionAction{
	public void doAction(){
		try{
			int a = (int)(Math.random() * 2);
			System.out.println("a = " + a);
			int c[] = { 1/a };
			c[a] = 71;
		} catch(ArithmeticException e){
			System.err.println("division on 0" + e);
		} catch(ArrayIndexOutOfBoundsException e){
			System.err.println("out of bound: " + e);
		}
		System.out.println("after try-catch");
	}
}