import java.util.Scanner;

public class CountTime {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        int yearOfBirth, monthOfBirth, dayOfBirth, currentYear, currentMonth;
        int resMonthBirth, resMonthCurrent, deltaYears, deltaMonths;

        System.out.println("Please enter the year of your birth: ");
        yearOfBirth = myScanner.nextInt();

        System.out.println("Please enter the month of your birth: ");
        monthOfBirth = myScanner.nextInt();

        //System.out.println("Please enter the day of your birth: ");
        //dayOfBirth = myScanner.nextInt();

        System.out.println("Please enter the current year: ");
        currentYear = myScanner.nextInt();

        System.out.println("Please enter the current month: ");
        currentMonth = myScanner.nextInt();

            resMonthBirth = (yearOfBirth - 1)*12 + monthOfBirth;
            resMonthCurrent = (currentYear - 1)*12 + currentMonth;
            deltaYears = (resMonthCurrent - resMonthBirth)/12;
            deltaMonths = (resMonthCurrent - resMonthBirth)%12;


            System.out.println("The number of years since your birth is " + deltaYears);
            System.out.println("The number of months since your birth is " + deltaMonths);

    }
}
