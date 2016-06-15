package by.bsu.com.exchanger;
public class Consumer extends Subject implements Runnable{
	public Consumer(String name, Item item){
		super(name, item);
	}
	public void run(){
		try{
			synchronized(item){
				int requiredNumber = item.getNumber();
				item = exchanger.exchange(item);
				if(requiredNumber >= item.getNumber()){
					System.out.println("Consumer " + getName()
										+ "it increases the cost of goods");
				} else{
					System.out.println("Costumer " + getName()
										+ "it reduces the cost of the goods");
				}
			}
		} catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}