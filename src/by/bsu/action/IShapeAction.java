package by.bsu.action;

import by.bsu.action.entity.AbstractShape;

public interface IShapeAction <T extends AbstractShape>{
	double computeSquare(T shape);
	double computePerimeter(T shape);
}