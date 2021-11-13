package me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after;

import me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after.factory.BlackshipFactory;
import me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after.factory.ShipFactory;
import me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after.factory.WhiteshipFactory;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteshipFactory(), "whiteship", "keesun@mail.com");
        client.print(new BlackshipFactory(), "blackship", "keesun@mail.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }

}
