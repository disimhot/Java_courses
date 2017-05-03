import sun.java2d.pipe.SolidTextRenderer;

import java.util.Arrays;
import java.util.Scanner;


public class PalindromeCheck {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        int cardinality;

        System.out.println("Введите мощность массива: ");
        cardinality = myScanner.nextInt();
        int array[] = new int[cardinality];

        for(int i = 0; i < array.length; i++){

            System.out.println("Введите элемент массива: ");
            Scanner myNumber = new Scanner(System.in);
            int number = myNumber.nextInt();
            array[i] = number;
        }

        boolean checkResult = true;
        for(int j = 0; j < array.length/2; j++){
            if (array[j] != array[array.length - j - 1]){
                checkResult = false;
                break;
            }
        }
    if (checkResult)System.out.println("Массив является палиндромом");else
            System.out.println("Массив не является палиндромом");
    }
}
