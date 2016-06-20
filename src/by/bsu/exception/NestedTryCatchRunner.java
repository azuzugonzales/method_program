package by.bsu.exception;
public class NestedTryCatchRunner{
	public void doAction(){
		try{
			int a = (int) (Math.random() * 2) -1;
			System.out.println("a = " + a);
			try{
				int b = 1/a;
				StringBuilder sb = new StringBuilder(a);
			} catch(NegativeArraySizeException e) {
				System.err.println("invalid buffer size: " + e);
			}
		} catch(ArithmeticException e){
			System.err.println("division on 0: " + e);
		}
	}
}