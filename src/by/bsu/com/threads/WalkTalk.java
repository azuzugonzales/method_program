package by.bsu.com.threads;
public class WalkTalk{
	public static void main(String[] args){
		// new objects threads
		TalkThread talk = new TalkThread();
		Thread walk = new Thread(new WalkRunnable());
		// start threads
		talk.start();
		walk.start();
		// WalkRunnable w = new WalkRunable(); // object, dont thread
		// w.run(): or talk.run(); // run method, but thread dont thread! 
	}
}