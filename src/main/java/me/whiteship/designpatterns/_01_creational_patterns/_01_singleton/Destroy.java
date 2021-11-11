package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Destroy {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Settings5 settings1 = Settings5.getInstance();
        Settings5 settings2 = Settings5.getInstance();

        Constructor<Settings5> declaredConstructor = Settings5.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Settings5 settings3 = declaredConstructor.newInstance();

        System.out.println(settings1 == settings2);
        System.out.println(settings1 == settings3);
    }
}
