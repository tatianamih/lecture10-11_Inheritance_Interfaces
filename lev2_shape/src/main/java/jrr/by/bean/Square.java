package jrr.by.bean;

public class Square  extends AbstractShape{
    private double sideOfTheSquare;

    public Square(double sideOfTheSquare) {
        this.sideOfTheSquare = sideOfTheSquare;
    }

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public double getArea() {
        return sideOfTheSquare * sideOfTheSquare;
    }
}
