package org.example;

public class Client {
    String name;
    String address;

    public Client(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
