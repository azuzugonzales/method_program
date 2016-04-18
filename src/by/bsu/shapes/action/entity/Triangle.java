package by.bsu.shapes.action.entity;

import static java.lang.Math.cos;
import static java.lang.Math.pow;

public class Triangle extends AbstractShape{
	private double b;
	private double angle;
	public Triangle(double a, double b, double angle){
		super(a);
		this.b = b;
		this.angle = angle;
	}
	public double getAngle(){
		return angle;
	}
	public double getB(){
		return b;
	}
	public double getC(){
		double c = pow(getA(), 2) + pow(b, 2) - 2 * getA() * b * cos(angle);
		return c;
	}
}