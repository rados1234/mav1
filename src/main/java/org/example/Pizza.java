package org.example;

public class Pizza extends Food{
PizzaSize size;

//
    public Pizza(PizzaSize size, String name) {
        this.size = size;
        this.name = name;
    }
    public String toString(){
        return super.toString() +" " +size;
    }
}
