package jrr.by.bean;

public class Cat extends Mammal {
    private boolean presenceOfATail;
    public Cat(String name, int maximumGrowth, int maximumWeight, boolean presenceOfATail) {
        super(name, maximumGrowth, maximumWeight);
        this.presenceOfATail = presenceOfATail;
    }
   private void meow() {
        System.out.println("meow, meow, moew");
    }
   private void climbingATree() {
        System.out.println("is climbing a tree");
    }
    @Override
    protected void move() {
        System.out.println("run");
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

