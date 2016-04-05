package by.bsu.task.action;

import by.bsu.task.entity.Matrix;
import by.bsu.task.exceptions.MatrixException;

public class Multiplicator {
    public Matrix multiply(Matrix p, Matrix q) throws MatrixException {
        int v = p.getVerticalSize();
        int h = p.getHorizontalSize();
        int temp = p.getHorizontalSize();

        if (temp != q.getVerticalSize()) {
            throw new MatrixException();
        }
        Matrix result = new Matrix(v, h);
        try {
            for (int i = 0; i < v; i++) {
                for (int j = 0; j < h; j++) {
                    int value = 0;
                    for (int k = 0; k < temp; k++) {
                        value += p.getElement(i, k) * q.getElement(k, j);
                    }
                    result.setElement(i, j, value);
                }
            }
        } catch (MatrixException e) {
        }
        return result;
    }
}