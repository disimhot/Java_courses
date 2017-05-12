package lecture5.a_exc0;

/*
Класс кинет исключение деления на нуль.
 */
public class Exc1 {
    public static void main(String[] args) {
     Exc1.subroutine();
    }

    static void subroutine(){
        int d = 0;
        int a = 10 / d;// В этой строке будет исключение
    }
}
