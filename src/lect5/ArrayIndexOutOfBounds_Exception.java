package lect5;

public class ArrayIndexOutOfBounds_Exception {
    public static void main(String[] args) {
        int index = 5;
        int[] array = new int[index];
        try{System.out.println(array[index]);}
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Индекс за пределами массива");
        }
    }
}
