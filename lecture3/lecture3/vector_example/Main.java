package ru.mai.javacourses.lecture3.vector_example;
/*
Пример класса Vector
Мы расчитываем длину вектора в методе len()
При создании объекта мы в конструкторе задаем параметры x,y,z.

Так же использован метод sqrt из класса Math:   Math.sqrt();
Он считает квадратный корень

И обратите внимание что поля класса Vector, объявлены приватными(private). Поддерживаем принцип инкапсуляции,
скрываем не нужные для пользователя детали.
 */

class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double xx, double yy, double zz) {
        x = xx;
        y = yy;
        z = zz;
    }

    double len() {
        return Math.sqrt(x * x + y * y + z * z);
    }
}

public class Main {
    public static void main(String[] args) {
        Vector v = new Vector(1,2,3);
        double vectorLength = v.len();

        System.out.println(vectorLength);


    }
}
