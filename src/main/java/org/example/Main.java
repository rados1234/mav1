package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Order> orders = new ArrayList<>();
        System.out.println("Pizzeria!");
        Order order1 = new Order(new Client("Zenek", "Łąkowa 11E"));
        order1.addItem(new Pizza(PizzaSize.big, "Pepperoni"));
        order1.addItem(new Drink("sok"));
        order1.addItem(new Drink("sok"));
        orders.add(order1);
        Order order2 = new Order(new Client("Krysia", "Nadrzeczna 6/3"));
        order2.addItem(new Pizza(PizzaSize.small, "Diaviola"));
        order2.addItem(new Pizza(PizzaSize.medium, "Capriosa"));
        order2.addItem(new Drink("rrrcola"));
        orders.add(order2);
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}