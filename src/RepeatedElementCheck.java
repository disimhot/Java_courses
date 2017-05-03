import java.util.Arrays;
import java.util.Scanner;

public class RepeatedElementCheck {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        int cardinality;

        System.out.println("Введите мощность массива: ");
        cardinality = myScanner.nextInt();
        int array[] = new int[cardinality];

           for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*100);
            }
        System.out.println(Arrays.toString(array));

        /*int array[] = {1, 2, 4, 4};*/


        boolean checkRes = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]){
                    checkRes = false;
                    break;
                }
            }
        }
        if (checkRes) System.out.println("В массиве нет дублей");
        else
            System.out.println("В массиве имеются дубли");


    }
}

