package by.bsu.shapes.action;

import by.bsu.shapes.entity.AbstractShape;

public interface IShapeAction extends ILineGroupAction{
	double computeSquare(AbstractShape shape);
}