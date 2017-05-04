package ru.mai.javacourses.lecture3.recurcions;

/*
Не успели мы на лекции рассмотреть пример рекурсии для расчета факториала
Данный пример есть в книжке Шилдта, полное руководство Java 8;

Смысл в том что мы рекурсивно вызываем функцию внутри самой себя.
Постарайтесь понять как это работает, если что спрашивайте на почту или разберем на следующей лекции.
 */

class Factorial {
    int fact(int n){
        int result;

        if (n==1) return 1;
        result = fact(n-1) * n;
        return result;
    }
}

class Recursion{
    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.out.println("Факториал 3 равен " + f.fact(3));
        System.out.println("Факториал 4 равен " + f.fact(4));
        System.out.println("Факториал 5 равен " + f.fact(5));
    }
}
