package me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after.factory;

import me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after.Ship;
import me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after.Whiteship;

public class WhiteshipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        return new Whiteship();
    }
}
