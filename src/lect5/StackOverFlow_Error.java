package lect5;

public class StackOverFlow_Error {

    public static int Over(){
        return Over();
    }

    public static void main(String[] args) {
        try{Over();}
        catch (StackOverflowError e){
            System.out.println("StackOverflow Error");
        }
    }
}
