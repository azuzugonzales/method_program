package by.bsu.com.yield;
public class YieldRunner{
	public static void main(String[] args){
		new Thread(){	// anonym class
			public void run(){
				System.out.println("start thread 1");
				Thread.yield();
				System.out.println("stoped 1");
			}
		}.start();
		new Thread(){
			public void run(){
				System.out.println("start thread 2");
				System.out.println("stoped 2");
			}
		}.start();
	}
}