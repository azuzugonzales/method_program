package by.bsu.creator;

public class Point2DCreator extends Point1DCreator{
	@Override
	public Point2D createPoint(){
		System.out.println("Point2D");
		return new Point2D(2, 5);
	}
}