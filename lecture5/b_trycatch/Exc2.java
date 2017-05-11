package lecture5.b_trycatch;


/*
Чтобы перехватить исключение, используем try...catch конструкцию
 */
public class Exc2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            int a = 42/d;
            System.out.println("Это не будет выведено");
        } catch (ArithmeticException e) { //перехватить ошибку деления на нуль
            System.out.println("Деление на нуль");
        }
        System.out.println("После оператора catch.");
    }
}
