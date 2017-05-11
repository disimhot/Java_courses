package lecture5.a_exc0;

/*
В классе FirstEx будет исключение
 */
public class FirstEx {
    public static void main(String[] args) {
        int d = 0;
        int a = 42/d; //В этой строке будет исключение ArithmeticException
    }
}
