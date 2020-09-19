package jrr.by.bean;

import java.util.Objects;

public class Animal {
    protected String name;
    protected int maximumGrowth;
    protected int maximumWeight;



    public Animal(String name, int maximumGrowth, int maximumWeight) {
        this.name = name;
        this.maximumGrowth = maximumGrowth;
        this.maximumWeight = maximumWeight;
    }

   final protected void eat () {
        System.out.println(name + " is eating");
    }

   final protected void sleep (){
        System.out.println(name + " is sleeping");

    }

    protected void move () {
        System.out.println(name + "is moving ");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return maximumGrowth == animal.maximumGrowth &&
                maximumWeight == animal.maximumWeight &&
                name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, maximumGrowth, maximumWeight);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", maximumGrowth=" + maximumGrowth +
                ", maximumWeight=" + maximumWeight +
                '}';
    }
}
