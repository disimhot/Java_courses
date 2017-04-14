import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class CountTime {
    public static void main(String[] args){
        //сохраняем текущую дату в переменной с экземпляром объекта LocalDate
        LocalDate dateToday = LocalDate.now();

        Scanner myScanner = new Scanner(System.in);

        int yearOfBirth, monthOfBirth, dayOfBirth, currentYear, currentMonth;
        //int resMonthBirth, resMonthCurrent, deltaYears, deltaMonths;

        System.out.println("Please enter the year of your birth: ");
        yearOfBirth = myScanner.nextInt();

        System.out.println("Please enter the month of your birth: ");
        monthOfBirth = myScanner.nextInt();

        System.out.println("Please enter the day of your birth: ");
        dayOfBirth = myScanner.nextInt();

        System.out.println("Your date of birth " + dayOfBirth + "." + monthOfBirth + "." + yearOfBirth + "\n");

        //создаем экземпляр объекта LocalDate с введенными параметрами
        LocalDate yourDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);

        //вычисляем период между двумя датами
        Period all_period = Period.between(yourDate, dateToday);

        //считаем только дни между двумя датами
        long only_days = ChronoUnit.DAYS.between(yourDate, dateToday);

        System.out.print("С этого времени прошло уже " + all_period.getYears() + " лет, " + all_period.getMonths() +
                " месяцев, и " + all_period.getDays() + " дней. (" + only_days + " дней от указанной даты)");

        /*System.out.println("Please enter the current year: ");
        currentYear = myScanner.nextInt();

        System.out.println("Please enter the current month: ");
        currentMonth = myScanner.nextInt();

            resMonthBirth = (yearOfBirth - 1)*12 + monthOfBirth;
            resMonthCurrent = (currentYear - 1)*12 + currentMonth;
            deltaYears = (resMonthCurrent - resMonthBirth)/12;
            deltaMonths = (resMonthCurrent - resMonthBirth)%12;


            System.out.println("The number of years since your birth is " + deltaYears);
            System.out.println("The number of months since your birth is " + deltaMonths);*/

    }
}
