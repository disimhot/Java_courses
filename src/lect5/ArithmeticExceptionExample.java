package lect5;


public class ArithmeticExceptionExample {
    public static void main(String[] args) throws ArithmeticException {
        try{
            int d = 0;
            int a = 10 / d;
        }catch (ArithmeticException e){
            processErrorCode(e);
        }
    }

    //Метод для обработки ошибок
    private static void processErrorCode(ArithmeticException e) throws ArithmeticException {
        if(e.getErrorCode() != 0){
            System.out.println("На нуль делить нельзя!");
            throw e;
        }
    }
}


