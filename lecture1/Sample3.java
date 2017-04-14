package ru.mai.javacourses.lecture1;
/*
Рассмотрим тип char, boolean и логические операторы
 */

public class Sample3 {
    public static void main(String[] args) {
        char ch1, ch2; //Объявили две переменные

        ch1 = 88; // 88 - код символа X по таблице Unicode, показывал на лекции
        ch2 = 'Y'; // Или так присваиваем. Внимание - значение символьного типа задается в одинарных кавычках

        System.out.print("сh1 и ch2 равны = ");//print - метод печати без перевода на следующую строку
        System.out.println(ch1 + " " + ch2);// кавычки между двумя плюсами это просто пробел.

        ch1 = 'X'; // код 88 по Unicode
        System.out.println("ch1 содержит символ " + ch1);

        ch1++; //так как char целочисленный тип, можем применить оператор инкремента.
        System.out.println("Теперь ch1 содержит символ " + ch1); // выведет Y (код 89 по Unicode)

        System.out.println("a"+"b"+"c");// Складывает символы. Кокатенация строк
        System.out.println('a'+'b'+'c');// Складывает коды юникод таблицы


        boolean flag = true;
        flag = true || false; //Логическое ИЛИ.
        System.out.println("Результат выражения true || false = " + flag);

        flag = true && false;// Логическое И
        System.out.println("Результат выражения true && false = " + flag);

        flag = !flag;// Логическое НЕ
        System.out.println("Результат выражения !flag = " + flag);


        // Продолжение в Sample4



    }
}
