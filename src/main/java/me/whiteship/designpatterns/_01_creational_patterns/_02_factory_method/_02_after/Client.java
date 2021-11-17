package me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after;

import me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after.factory.BlackShipFactory;
import me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after.factory.ShipFactory;
import me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after.factory.WhiteShipFactory;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteShipFactory(), "whiteship", "keesun@mail.com");
        client.print(new BlackShipFactory(), "blackship", "keesun@mail.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }

}
