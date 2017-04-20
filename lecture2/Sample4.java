package ru.mai.javacourses.lecture2;

/*
Операторы перехода break continue return
 */

public class Sample4 {
    public static void main(String[] args) {
        //пример выхода из цикла
        for (int i = 0; i < 100; i++) {
            if (i == 10) break; // выход из цикла если i равно 10
            System.out.println("i: " + i);
        }
        System.out.println("Конец цикла");

        //Так же break можно сделать и в цикле while
        //Он так же выйдет из цикла как и в случае с for

        //вложенные циклы. break выходит на внешний цикл
        for (int i = 0; i < 3 ; i++) {
            System.out.print("Проход " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if(j == 10) break;
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Циклы завершены");

        //break можно использовать для реализации goto
        //метка first, имя метки придумываете сами
        first: for (int i = 0; i < 3 ; i++) {
            System.out.print("Проход " + i + ": ");
            for (int j = 0; j < 100; j++) {
                //выйдет из двух циклов к метке first
                if(j == 10) break first;
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Циклы завершены");

        //Оператор continue
        //В отличие от break, continue не прекращает цикл
        //а переходит к следующей его итерации
        //следующая функция демонстрирует пример использования оператора continue
        continueExample();

        //И наконец-то оператор return
        //Применение return описано в презентации
        //Ниже функция демонстрирует пример использования оператора return
        returnExample();
    }

    static void continueExample(){
        //Четные будут слева, нечетные справа
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i%2 == 0) continue;
            System.out.println("");
        }
    }

    static void returnExample(){
        boolean t = true;

        System.out.println("До возврата.");
        //if обязательный, иначе будет ошибка недостижимости кода
        if(t) return; //возврат в вызывающий код

        System.out.println("Этот оператор не будет выполняться.");
    }
}
