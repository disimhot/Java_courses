package lect5;


import java.util.Scanner;

public class NumberFormat_Exception {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String a = myScanner.next();
        try {
            int b = Integer.parseInt(a); //Преобразование строки в число
            System.out.println("Your number is " + b);
        }catch(NumberFormatException e){
            System.out.println("Wrong format");
        }
    }
}
