package ru.mai.javacourses.lecture1;

/*
Задача с лекции:
Даны два промежутка времени:
1) 25 число 18:41
2) 29 число 16:52

Найти разницу во времени между этими промежутками и вывести результат в формате:  dd дней, hh часов, mm минут.
 */
public class Lesson1Task {

    public static void main(String[] args) {
        //ниже задана первая дата (день, часы, минуты)
        int day1 = 25;
        int hour1 = 18;
        int minute1 = 41;

        //теперь задаем вторую дату (день, часы, минуты)
        int day2 = 29;
        int hour2 = 16;
        int minute2 = 52;

        //количество минут, прошедших с начала месяца до 25 числа 18 часов 41 минуты
        int total1 = (day1 * 24 + hour1) * 60 + minute1;
        //аналогично для второй даты
        int total2 = (day2 * 24 + hour2) * 60 + minute2;
        //разницы между двумя датами в минутах
        int delta = total2 - total1;

        //Теперь главные вычисления
        int deltaMinutes = delta % 60; //минуты
        int deltaHours = (delta / 60) % 24; //часы
        int deltaDays = (delta /60) / 24; //дни

        System.out.println(deltaDays + " дней " + deltaHours + " часов " + deltaMinutes + " минут ");

    }


}
