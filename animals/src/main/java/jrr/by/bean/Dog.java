package jrr.by.bean;

public class Dog extends Mammal{
   private boolean presenceOfATail;


    public Dog(String name, int maximumGrowth, int maximumWeight) {
        super(name, maximumGrowth, maximumWeight);
        this.presenceOfATail = presenceOfATail;
    }
   private void bark() {
        System.out.println("woof, woof, woof");
    }
    private void executeTheFASCommand() {
        System.out.println("is is biting");
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
