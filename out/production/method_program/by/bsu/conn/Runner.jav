package by.bsu.com.conn;
public class Runner{
	public static void main(String[] args){
		SameResource f = new SameResource();
		try{
			Connector.loadResource(f);
		} catch(IllegalArgumentException e){
			System.err.print("unchecked-exception handling is a method: " + e);
		}
	}
}