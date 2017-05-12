package lecture5.e_finally;

/*
Блок finally - выполняется в любом случае, даже ранее сгенерировано исключение.
ДАЖЕ - если в try или catch написать return, то перед возвращением управления, блок finally всё равно выполнится
 */
public class FinallyDemo {
    public static void main(String[] args) {
        try {
            procA();
        }catch (Exception e){
            System.out.println("Исключение перехвачено");
        }

        procB();
        procC();
    }

    static void procA(){
        try {
            System.out.println("В теле метода procA().");
            throw new RuntimeException("Демонстрация");
        }finally {
            System.out.println("Блок оператора finally в методе procA()");
        }
    }

    static void procB(){
        try {
            System.out.println("В теле метода procB()");
            return;
        } finally {
            System.out.println("Блок оператора finally в методе procB()");
        }
    }

    static void procC(){
        try {
            System.out.println("В теле метода procC");
        }finally {
            System.out.println("Блок оператора finally в методе procC().");
        }
    }
}
