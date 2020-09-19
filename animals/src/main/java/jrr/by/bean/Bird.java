package jrr.by.bean;

public abstract class Bird extends Animal {

    protected int wing;
    protected String theColorOfTheFeathers;


    public Bird(String name, int maximumGrowth, int maximumWeight, int wing, String theColorOfTheFeathers) {
        super(name, maximumGrowth, maximumWeight);
        this.wing = wing;
        this.theColorOfTheFeathers = theColorOfTheFeathers;
    }


    @Override
    protected void move() {
        System.out.println("flying");
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

