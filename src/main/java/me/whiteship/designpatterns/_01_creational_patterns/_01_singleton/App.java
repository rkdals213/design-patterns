package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

import java.io.*;

public class App {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Settings6 settings = Settings6.INSTANCE;

        Settings6 settings1 = null;
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings1 = (Settings6) in.readObject();
        }

        System.out.println(settings == settings1);
    }

}
