package lecture4.abstract_example;

/*
Пример создания абстрактного класса
 */
public class TestAbstract {
    public static void main(String[] args) {

    }
}

abstract class A{
    int number;

    void makeSmth(){
        System.out.println("Make smth");
    }

    abstract void makeSmthAbstract();
}

/*
Создали абстрактный класс

 */
class B extends A{

    /*
    Реализовали метод абстрактного класса.
     */
    void makeSmthAbstract() {
        System.out.println("Make something in B extends A");
    }
}



