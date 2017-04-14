import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class FirstHomeworkExample {

    public static void main(String[] args) {

        //сохраняем текущую дату в переменной с экземпляром объекта LocalDate
        LocalDate dateToday = LocalDate.now();

        //переменные для хранения вводимых дня, месяца и года
        int day, month, year;

        Scanner yourInput = new Scanner(System.in);

        //Отображаем просьбы в терминале и сохраняем ввод в переменных
        System.out.println("Введите цифрами год рождения: ");

        year = yourInput.nextInt();

        System.out.println("Введите цифрами месяц рождения: ");

        month = yourInput.nextInt();

        System.out.println("Введите цифрами день рождения: ");

        day = yourInput.nextInt();

        //отображаем введенную дату
        System.out.println("Вы ввели дату: " + day + "." + month + "." + year + "\n");

        //создаем экземпляр объекта LocalDate с введенными параметрами
        LocalDate yourDate = LocalDate.of(year, month, day);

        //вычисляем период между двумя датами
        Period all_period = Period.between(yourDate, dateToday);

        //считаем только дни между двумя датами
        long only_days = ChronoUnit.DAYS.between(yourDate, dateToday);

        System.out.print("С этого времени прошло уже " + all_period.getYears() + " лет, " + all_period.getMonths() +
                " месяцев, и " + all_period.getDays() + " дней. (" + only_days + " дней от указанной даты)");
    }
}
