package ru.mai.javacourses.lecture4.default_method;

/**
 * Created by nikita on 05.04.16.
 */
public class DefaultTest implements MyIF{

    //Этот метод обязательно переопределили
    public void callMe() {

    }
}

interface MyIF{
    void callMe();

    //Этот метод можно не переопределять
    //метод реализован по умолчанию
    default void callMeTwo(){
        System.out.println("Я метод реализованный" +
                " в интерфейсе");
    }

}
