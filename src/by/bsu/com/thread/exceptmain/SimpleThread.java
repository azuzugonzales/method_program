package by.bsu.com.thread.exceptmain;
public class SimpleThread extends Thread{
	public void run(){
		try{
			Thread.sleep(1000);
		} catch(InterruptedException e){
			System.err.print(e);
		}
		System.out.println("end of SimpleThread");
	}
}