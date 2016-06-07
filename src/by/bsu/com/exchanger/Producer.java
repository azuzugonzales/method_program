package by.bsu.com.exchanger;
public class Producer extends Subject implements Runnable{
	public Producer(String name, Item item){
		super(name, item);
	}
	public void run(){
		try{
			synchronized(item){
				int producedNumber = this.getItem().getNumber();
				item = exchanger.exchange(item);
				if(producedNumber <= item.getNumber()){
					System.out.println("Producer " + getName()
										+ "it increases the production of a good plan");
				} else{
					System.out.println("Producer "+ getName()
										+ "plan reduces production of goods");
				}
			}
		} catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}