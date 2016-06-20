package by.bsu.synch;
import java.io.IOException;
public class SynchroRun{
	public static void main(String[] args){
		Resource s = null;
		try{
			s = new Resource("data\\result.txt");
			SynchThread t1 = new SynchThread("First", s);
			SynchThread t2 = new SynchThread("Second", s);
			t1.start();
			t2.start();
			t1.join();
			t2.join();
		} catch(IOException e){
			System.err.print("error file: " + e);
		} catch(InterruptedException e){
			System.err.print("error thread: " + e);
		} finally{
			s.close();
		}
	}
}