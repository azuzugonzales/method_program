package by.bsu.daemons;
public class SimpleThread extends Thread{
	public void run(){
		try{
			if(isDaemon()) {
				System.out.println("start thread-daemon");
				Thread.sleep(10_000); // change parameter on 1
			} else{
				System.out.println("start normal thread");
			}
		} catch(InterruptedException e){
			System.err.print(e);
		} finally{
			if(!isDaemon()){
				System.out.println("stop normal thread");
			} else{
				System.out.println("stop thread-daemon");
			}
		}
	}
}