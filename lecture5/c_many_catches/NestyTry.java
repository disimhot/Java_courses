package lecture5.c_many_catches;

/*
Пример демонстрирует вложенный try...catch
 */
public class NestyTry {
    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 42 / a;

            System.out.println("a = "+a);
            try {
                if (a==1) a = a/(a-a);
                if (a==2){
                    int c[] = {1};
                    c[42] = 99;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("За пределами массива: " + e);
            }
        } catch (ArithmeticException e) {
            System.out.println("Деление на нуль: " + e);
        }
    }
}
