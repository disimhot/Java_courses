package ru.mai.javacourses.lecture2;


/*
Управляющие конструкции

Сначала рассмотрим операторы выбора if и switch
 */

import java.util.Scanner;

public class Sample2 {
    public static void main(String[] args) {
        int a,b;
        a = 3;
        b = 5;
        //в условном операторе if можно использовать логические операторы
        if(a<b) a = 0;
        else b = 0;
        System.out.println("a = "+ a + "\nb = "+b);

        boolean flag = true;
        //либо передавать непосредственно переменную типа boolean
        if (flag){
            System.out.println("Значение flag = " + flag);
        }else {
            System.out.println("Значение flag = " + flag);
        }

        //могут быть вложенные условия
        //Пример...

        //Вызов метода, именованого блока кода
        //checkEvenOdd();

        //Выражение в switch может иметь тип byte,short,int,char, String(JDK 7 и выше), enum.
        int dayOfWeek = 7;
        //Показать пример со строками(String)
        switch (dayOfWeek){
            case 1:
                System.out.println("Понедельник");
                //Оператор break нужен для выхода из switch. Если убрать break то выполнение продолжится до следующего break
                //или до блока default
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Нет дня недели с таким номером");
        }

        //Swtich может быть вложенным как и в случае с if-else
    }





    //Пример проверки числа на точность с помощью if-else
    //Чтобы вызвать эту функцию нужно в главной функции main написать её имя, вот так: checkEvenOdd();
    static void checkEvenOdd(){
        System.out.println("Проверка числа на четное/нечетное\nВведите ваше число:");
        //Создадим объект типа Scanner, для чтения значений с консоли
        Scanner sc = new Scanner(System.in);
        //Считываем int-овое значение c консоли и записываем его в переменную yourNumber
        int yourNumber = sc.nextInt();

        //Если остаток от деления равен нулю
        if (yourNumber%2 == 0){
            System.out.println("Число "+ yourNumber + " четное");
        }else {
            System.out.println("Число " + yourNumber +" нечетное");
        }
    }
}
