package lect5;


import java.util.Scanner;

public class Arithmetic_Exception {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите делитель: ");
        int n = myScanner.nextInt();
        System.out.println("Введите делимое: ");
        int m = myScanner.nextInt();

        try{System.out.println("Результат деления: " + m/n);}
        catch (ArithmeticException e){
            System.out.println("Нельзя делить на ноль!");
        }

    }

}
