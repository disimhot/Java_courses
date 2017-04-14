package ru.mai.javacourses.lecture1;

/*

 */
public class Sample4 {
    public static void main(String[] args) {
        int number = 11;
        System.out.println("Объявление и инициализации переменной number = " + number);

        number += 2; // то же самое что и: number = number + 2;
        System.out.println("Результат number += 2; " + number);//выведет 13

        number -= 5;
        System.out.println("Результат number -= 5; " + number);//выведет 8

        number = 5;
        number++;//то же что и: number = number + 1;
        System.out.println("Результат number++; " + number);
        System.out.println("");

        number = 2;
        System.out.println(number++); // number++ сначала вернет значение потом присвоит 1
        System.out.println(++number); // ++number сначала присвоит 1 потом вернет значение

    }
}
