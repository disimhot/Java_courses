package lect5;


public class ArithmeticException extends Exception {
    private int errorCode;

    public ArithmeticException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}


