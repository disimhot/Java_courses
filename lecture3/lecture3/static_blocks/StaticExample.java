package ru.mai.javacourses.lecture3.static_blocks;
/*
Ключевые слова static и final мы мельком рассмотрели в конце лекции,
 поэтому самостоятельно еще раз почитайте про static и final

 static:
 объявив переменную или метод как static мы можем обращаться к ним по имени класса. Вот так:
 Box.volume();
 вместо
 Box box = new Box();
 box.volume;
 Т.е это некий аналог глобальной переменной или метода.
 Запомните что static переменные и static блоки инициализируются и выполняются во время загрузки класса

 final:
 способ объявить неизменяемую переменную(константу)
 final метод и final класс - относятся к наследованию, рассмотрим на следующей лекции
 */

//Ниже пример, запустите его и посмотрите в каком порядке проходит инициализация.
//Вы должны увидеть что static блоки и переменные выполняются первыми.
class Loader {

    static final String theName = "The Loader";
    static {
        System.out.println("Loader.static");
    }
    Loader() {
        System.out.println("Loader.Loader()");
    }
}

class Test {
    static {
        System.out.println( "Test.static");
    }
    Test() {
        System.out.println( "Test.Test()");
        Loader l;
        System.out.println(Loader.theName);
    }
    public static void main( String [] args ) {
        System.out.println( "Test.main");
        Test t = new Test();
        System.exit(0);
    }
}
