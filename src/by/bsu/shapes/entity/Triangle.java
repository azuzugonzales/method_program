package by.bsu.shapes.entity;
import static java.lang.Math.*;

public class Triangle extends AbstractShape{
	private double b;
	private double c;
	//private double angle;
	//public Triangle(double a, double b, double angle){
	public Triangle(double a, double b, double c){
		super(a);
		this.b = b;
		this.c = c;
		//this.angle = angle;
	}
	/*public double getAngle(){
		return angle;
	}*/
	public double getB(){
		return b;
	}
	public double getC(){
		//double c = getA() + b; a := sqrt(b*b+c*c-2*b*c*cos(alpha));
		return c;
	}
}