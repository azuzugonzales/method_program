package by.bsu.synch;
public class SynchThread extends Thread{
	private Resource rs;
	public SynchThread(String name, Resource rs){
		super(name);
		this.rs = rs;
	}
	public void run(){
		for (int i = 0; i < 5; i++){
			rs.writing(getName(), i);	// synchronization trigger position
		}
	}
}