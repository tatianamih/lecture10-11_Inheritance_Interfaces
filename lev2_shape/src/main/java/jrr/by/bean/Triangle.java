package jrr.by.bean;

public class Triangle extends AbstractShape{
    private double theLengthOfTheBase;
    private double height;

    public Triangle(double theLengthOfTheBase, double height) {
        this.theLengthOfTheBase = theLengthOfTheBase;
        this.height = height;
    }

    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public double getArea() {
        return 0.5 * (theLengthOfTheBase * height);
    }
}
