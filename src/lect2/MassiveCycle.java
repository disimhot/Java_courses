package lect2;

import java.util.Arrays;
import java.util.Scanner;

public class MassiveCycle {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        int shiftPos;

        System.out.println("Введите число позиций для сдвига вправо: ");
        shiftPos = myScanner.nextInt();

        int array[] = {1,2,3,4,5,6};
        int tmp[] = new int[6];
        shiftPos = shiftPos % array.length;

        for (int i=0; i < shiftPos; i++){
            for (int j = 0 ; j + shiftPos < array.length; j++){
                tmp[j + shiftPos] = array[j];
         }
         tmp[shiftPos - i - 1] = array[array.length - i - 1];
        }

      if (shiftPos == 0){
          System.out.println(Arrays.toString(array));
      }else{System.out.println(Arrays.toString(tmp));}
    }
}



