package lecture5.c_many_catches;

/*
Пример в котором показано, что 'отлов' исключений должен идти в правильном порядке
Сначала ловятся более узкие типы, а после общие типы исключений(например Exception)
Пример ниже показывает как нельзя делать!
 */
public class SuperSubCatch {
    public static void main(String[] args) {
        /*try {
            int a = 0;
            int b = 42 / a;
        } catch (Exception e){
            System.out.println("Перехват исключений общего класса Exception.");
        }catch (ArithmeticException e){
            System.out.println("Этот код вообще недостижим");
        }*/
    }
}
