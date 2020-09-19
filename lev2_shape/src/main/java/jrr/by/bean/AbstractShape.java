package jrr.by.bean;

import jrr.by.interfaces.Shape;

public class AbstractShape implements Shape {
    private String name;
    private double area;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return area;
    }
}
