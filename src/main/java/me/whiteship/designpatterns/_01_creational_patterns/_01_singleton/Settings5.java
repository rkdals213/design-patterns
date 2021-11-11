package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

import java.io.Serializable;

/**
 * static inner 클래스 홀더
 */
public class Settings5 implements Serializable {

    private Settings5() { }

    private static class Settings5Holder {
        private static final Settings5 INSTANCE = new Settings5();
    }

    public static Settings5 getInstance() {
        return Settings5Holder.INSTANCE;
    }

}
