package lect5;

public class NullPointer_Exception {
    public static void main(String[] args) {
        NullPointer_Exception object = null;
        try{
            object.toString();
            System.out.println("No mistakes ");
        }catch (NullPointerException e){
            System.out.println("NullPointerException");
        }
    }
}
