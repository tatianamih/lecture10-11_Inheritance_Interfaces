package jrr.by.bean;

import org.junit.Test;

public class ShapeDemoTest {
    @Test
    public void demonstrationOfshapes() {
        Circle circle = new Circle(5.2);
        Square square = new Square(2.0);
        Triangle triangle = new Triangle(4.0, 5.0);
        AbstractShape[] geometricalFigure = {circle, square,  triangle};

        for (int i = 0; i < geometricalFigure.length; i++) {
            System.out.println(geometricalFigure[i]);
        }
    }
}
