package jrr.by.bean;

public class Parrot extends Bird {

    public Parrot(String name, int maximumGrowth, int maximumWeight, int wing, String theColorOfTheFeathers) {
        super(name, maximumGrowth, maximumWeight, wing, theColorOfTheFeathers);
    }

    private void talk () {
        System.out.println(name + "is talking ");

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


