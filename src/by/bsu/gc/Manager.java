package by.bsu.gc;
public class Manager{
	private int id;
	public Manager(int value){
		id = value;
	}
	protected void finalize() throws Throwable{
		try{
			System.out.println("object has deleted, id = " + id);
		} finally{
			super.finalize();
		}
	}
}