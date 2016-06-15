package by.bsu.com.action;


import by.bsu.com.action.entity.Rectangle;

public class RectangleAction implements IShapeAction<Rectangle>{
	@Override
	public double computeSquare(Rectangle shape){
		return shape.getA() * shape.getB();
	}
	@Override
	public double computePerimeter(Rectangle shape){
		return 2 * (shape.getA() + shape.getB());
	}
}