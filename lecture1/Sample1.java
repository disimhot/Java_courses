// package - пакет в котором находится наш класс.
// Нечто вроде контейнера который несет в себе наши классы.
package ru.mai.javacourses.lecture1;
/*
Пример первой программы Hello World:

Sample1 - имя класса. Имена классов - всегда с большой буквы.
class - ключевое слово для объявления класса.
public - модификатор доступа. Делает класс доступным для использования за пределами нашего пакета

Класс - некая оболочка в которой описываются все функции нашей программы. Подробнее рассмотрим на лекции по ООП.
 */
public class Sample1 {
    // Метод с именем main. Имена методов всегда с маленькой буквы. Метод - это именованный обособленный блок кода
    // void - метод не возвращает никаких значений
    // static - означает что метод не привязан ни к какому определенному экземпляру Класса. Подробнее на лекции...
    // public - метод класса доступен всем за пределами пакета.

    //String[] args - аргумент метода, массив строк. Я показывал как можно передать значения в этот метод через консоль.
    public static void main(String[] args) {
        //System.out.println - команда для печати на консоль
        System.out.println("Hello World!"); // "Hello World" - в двойных кавычках, потому что строка.

        //В конце каждой команды не забываем ставить точку с запятой;
    }
}