package jrr.by.bean;

public class Mammal extends Animal {
    protected int numberOfTeeth;
    protected String coatColor;
    public Mammal(String name, int maximumGrowth, int maximumWeight) {
        super(name, maximumGrowth, maximumWeight);
    }
   final protected void feedingChildrenWithMilk(){
       System.out.println("All mammal feed their children with milk");
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
