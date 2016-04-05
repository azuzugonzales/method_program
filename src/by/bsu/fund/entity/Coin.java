package by.bsu.fund.entity;
public class Coin {
	private double diameter;
	public Coin(double diameter){
		super();
		initDiameter(diameter);
	}
	public final void initDiameter(double value){
		if(value > 0) {
			diameter = value;
		} else {
			System.out.println("Negative diameter!");
		}
	}
}