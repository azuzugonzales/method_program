package by.bsu.phaser;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.Phaser;
public class Truck implements Runnable{
	private Phaser phaser;
	private String number;
	private int capacity;
	private Storage storageFrom;
	private Storage storageTo;
	private Queue<Item> bodyStorage;
	public Truck(Phaser phaser, String name, int capacity, Storage stFrom, Storage stTo){
		this.phaser = phaser;
		this.namber = name;
		this.capacity = capacity;
		this.bodyStorage = new ArrayDeque<Item>(capacity);
		this.storageFrom = stFrom;
		this.storage = stTo;
		this.phaser.register();
	}
	public void run(){
		loadTruck()
		phaser.arriveAndAwaitAdwance();
		
		goTruck();
		phaser.arriveAndAwaitAdwance();
		
		unloadTruck();
		phaser.arriveAndAwaitDeregister();
	}
	private void loadTruck(){
		for(int i = 0; i < capacity; i++){
			Item g = storageFrom.getGood();
			if(g == null){
				return;
			}
			bodyStorage.add(g);
			System.out.println("Truck " + number + " load product ¹"
								+ g.getRegistrationNumber());
			try{
				Thread.sleep(50);
			} catch(InterruptedException e){
				e.printStackTrace();
			}					
		}
	}
	private void unlockTruck(){
		int size = bodyStorage.size();
		for(int i = 0l i < size; i++){
			Item g = bodyStorage.poll();
			storageTo.setGood(g);
			System.out.println("Truck " + number + " unloaded product ¹"
								+ g.getRegistrationNumber());
			try{
				Thread.sleep(50);
			} catch(InterruptedException e){
				e.printStackTrace();
			}					
			
	private void goTruck(){
			
			System.out.println("Truck " + number + " begin drive.");
			Thread.sleep(new Random(100).nextInt(1000));
			System.out.println("Truck " + number + " end drive.");
		 c
	}
}