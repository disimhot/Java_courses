package lect5;

import java.util.Scanner;

public class StringIndexOutOfBound_Exception {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите строку более 5 символов ");
        String string = myScanner.next();
        try {
            char result = string.charAt(4);
            System.out.println("Ваша строка: " + string);
            System.out.println("Пятый символ: " + result);

        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Вы ввели менее 5 символов");
        }
    }
}
