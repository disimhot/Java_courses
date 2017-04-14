    import java.util.Scanner;

public class Sample1 {
    public static void main(String[] args) {
        //Создаем переменную типа Scanner
        Scanner myScanner = new Scanner(System.in);

        //Создаем переменную в которую будем сохранять введенное нами значение
        int myNumber;

        //Просим ввести число
        System.out.println("Введите пожалуйста число: ");

        //Считываем введенное пользователем число и заносим его в переменную myNumber
        myNumber = myScanner.nextInt();

        //Выведем число которое ввел пользователь
        System.out.println("Ваше число: " + myNumber);
    }
}
