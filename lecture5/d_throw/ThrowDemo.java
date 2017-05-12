package lecture5.d_throw;

/*
Демонстрация оператора throw
 */
public class ThrowDemo {
    public static void main(String[] args) {
        try {
            demoproc();
        }catch (NullPointerException e){
            System.out.println("Повторный перехват исключения " + e);
        }
    }

    static void demoproc(){
        try{
            throw new NullPointerException("Демонстрация"); //Кидаем новое исключение
        }catch (NullPointerException e){
            System.out.println("Исключение перехвачено в теле метода demoproc()/");
            throw e;//повторно сгенерируем исключение
        }
    }
}
