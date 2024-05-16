package org.example;

import java.util.ArrayList;

public class Order {
    Client client;
    ArrayList<Food> items = new ArrayList<>();
    public Order(Client client) {
        this.client = client;
    }
    public void addItem(Food food){
        items.add(food);
    }
    public String toString(){
        return client.toString()+"\n"+
                items;
    }
}
