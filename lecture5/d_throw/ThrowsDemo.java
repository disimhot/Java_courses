package lecture5.d_throw;

/*
Пример использования throws
throws - говорит что метод выкидывает исключение
 */
public class ThrowsDemo {
    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Перехвачено исключение: " + e);
        }
    }

    static void throwOne() throws IllegalAccessException {
        System.out.println("В теле метода throwOne().");
        throw new IllegalAccessException("Демонатсрация");
    }
}
