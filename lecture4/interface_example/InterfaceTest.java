package lecture4.interface_example;


public class InterfaceTest{
    public static void main(String[] args) {

    }
}

//Создаем интерфейс
interface Instrument {
    final static String key = "До мажор"; // Поля интерфейса по умолчанию final static
    public void play();
}

//Реализуем интерфейс в следующих классах
//Обязательно переопределяем методы
class Drum implements Instrument {
    //Реализованный метод play() из интерфейса Instrument
    public void play() {
        System.out.println("бум бац бац бум бац бац");
    }
}
class Guitar implements Instrument {
    public void play() {
        System.out.println("до ми соль до ре до");
    }
}