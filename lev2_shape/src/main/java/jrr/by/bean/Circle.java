package jrr.by.bean;

public class Circle  extends AbstractShape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
}
