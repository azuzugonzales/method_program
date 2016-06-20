package by.bsu.nested;
public class Ship{
	private int id;
	public static class LifeBoat{
		private int boatId;
		public static void down(){
			System.out.println("Boat on the water!");
		}
		public void swim(){
			System.out.println("Sim boat");
		}
	}
}