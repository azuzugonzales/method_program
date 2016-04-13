package by.bsu.inner;
public class Ship{
	private Engine eng;
	
	public class Engine{
		public void launch(){
			System.out.println("Start the engine");
		}
	}
	public final void init(){
		eng = new Engine();
		eng.launch();
	}
}