package by.bsu.blocking;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
public class RunBlocking{
	public static void main(String[] args){
		final BlockingQueue<String> queue = new ArrayBlockingQueue<String>(2);
		new Thread(){
			public void run(){
				for(int i = 1; i < 4; i++){
					try{
						queue.put("Java" + i); // added 3-ds
						System.out.println("Element " + i + " added");
					} catch(InterruptedException e){
						e.printStackTrace();
					}
				}
			}
		}.start();
		new Thread(){
			public void run(){
				try{
					Thread.sleep(1_000);
					System.out.println("Element " + queue.take() + " took");
				} catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		}.start();
	}
}