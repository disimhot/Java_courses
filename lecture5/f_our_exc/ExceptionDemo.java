package lecture5.f_our_exc;


/*
Здесь мы пишем собственное исключение.
Наследуемся от Exception и реализуем условие когда выбросить исключение
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        try{
            compute(1);
            compute(20);
        }catch (MyException e){
            System.out.println("Перехвачено исключение: " + e);
        }
    }

    static void compute(int a) throws MyException{
        System.out.println("Вызван метод compute("+ a +")");
        if (a>10)
            throw new MyException(a);
        System.out.println("Нормальное завершение");
    }
}

class MyException extends Exception{
    private int detail;

    public MyException(int detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "MyException["+ detail + "]";
    }
}
