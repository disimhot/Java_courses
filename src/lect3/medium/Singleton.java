package lect3.medium;

import sun.font.TrueTypeFont;


public final class Singleton {
    //Единственный экземпляр класса
    private static Singleton instance;

    //Конструктор объявляем приватным
    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}


