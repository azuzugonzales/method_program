package by.bsu.action;

import by.bsu.action.entity.Triangle;

public class TriangleAction implements IShapeAction<Triangle>{
	@Override
	public double computeSquare(Triangle shape){
		return 0.5 * shape.getA() * shape.getB() + Math.sin(shape.getAngle());
	}
	@Override
	public double computePerimeter(Triangle shape){
		return shape.getA() + shape.getB() + shape.getC();
	}
}
