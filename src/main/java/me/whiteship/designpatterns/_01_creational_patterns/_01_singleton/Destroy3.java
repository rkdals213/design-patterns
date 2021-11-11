package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

import java.lang.reflect.Constructor;

public class Destroy3 {
    public static void main(String[] args) throws Exception {
        Settings6 settings1 = Settings6.INSTANCE;

        Settings6 settings2 = null;
        Constructor<?>[] declaredConstructors = Settings6.class.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            declaredConstructor.setAccessible(true);
            settings2 = (Settings6) declaredConstructor.newInstance("INSTANCE");
        }

        System.out.println(settings1 == settings2);
    }
}
