package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

public class Settings3 {

    private static final Settings3 instance = new Settings3();

    private Settings3() { }

    public static Settings3 getInstance() {
        return instance;
    }

}
