package by.bsu.com.nested;
public class RunnerShip{
	public static void main(String[] args){
		Ship.LifeBoat.down();
		Ship.LifeBoat lifeBoat = new Ship.LifeBoat();
		lifeBoat.swim();
	}
}