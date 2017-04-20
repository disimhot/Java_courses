import java.util.Arrays;
import java.util.Scanner;

public class MassiveCycle {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        int shiftPos;

        System.out.println("Введите число позиций для сдвига вправо: ");
        shiftPos = myScanner.nextInt();

        int k = 0;
        int m = shiftPos;
        int array[] = {1,2,3,4,5,6};
        int array1[] = new int[12];


        for (int i = 0; i < shiftPos; i++) {
            for (int j = shiftPos; j >= shiftPos; j++) {

                 array1[j] = array[m++];
                 //arrayRight [j] = array[m++];
             }

            array[k] = array[k++];

        }

        System.out.println(Arrays.toString(array1));
    }
}
