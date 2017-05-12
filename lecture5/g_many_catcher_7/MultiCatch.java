package lecture5.g_many_catcher_7;
/*
Пример многократного перехвата исключений, доступен с версии Java 7
Не рассматривали на лекции, но можно перехватывать исключения и таким способом

 */

public class MultiCatch {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int vals[] = {1,2,3};

        try{
            int result = a/b;
            vals[10] = 19;
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Исключение перехвачено: " + e);
        }

        System.out.println("После многократного перехвата.");
    }
}
