import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int array[] = new int[10];

        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*100);
            System.out.println(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }

            }
        }
        System.out.println(Arrays.toString(array));
    }
}

