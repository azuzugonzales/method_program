package by.bsu.com.action;

import by.bsu.com.action.entity.AbstractShape;

public interface IShapeAction <T extends AbstractShape>{
	double computeSquare(T shape);
	double computePerimeter(T shape);
}