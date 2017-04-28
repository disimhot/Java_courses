package ru.mai.javacourses.lecture2;

import java.util.Arrays;

/*
Массив - это группа однотипных переменных, для обращения к которым используется общее имя.
Каждая переменная - элемент массива. Чтобы обратиться к переменной - надо знать индекс. Нумерация с нуля.

 */
public class Sample1 {
    public static void main(String[] args) {
        //объявляем массив типа int
        //есть альтернативный синтаксис int[] month_days;
        int month_days[];
        //резервируем память для 12-ти элементного массива и связываем с переменной month_days
        //все элементы инициализируются нулевыми значениями
        month_days = new int[12];

        //далее можем обращаться к любому элементу по индексу
        //Выведем значение элемента нашего массива с индексом 3
        System.out.println(month_days[3]);//выведет ноль, так как мы ничего не присвоили
        month_days[3] = 30;//присвоили четвертому элементу массива значение 30
        System.out.println(month_days[3]);//теперь выведет 30

        //объявление массива можно объединить с инициализацией
        int numbers[] = new int[12];
        //а можно непосредственно задать значения в наш массив
        //кол-во значений и будет размерностью массива
        int numbers2[] = {1,2,3,4,5,6};
        System.out.println(numbers2[5]);//выведем последний элемент
        System.out.println("-------------");

        //Чтобы получить кол-во элементов в массиве(т.е длину массива), можно вызвать метод length
        System.out.println(numbers2.length);//выведет 6, длина массива numbers2


        //Объявляем и инициализируем двумерный массив
        //Будет выглядеть как простая матрица 4x5
        //Представляет собой по сути массив массивов
        int twoD[][] = new int[4][5];
        //Присвоим элементу с индексами [4][5] значение 10
        twoD[0][1] = 10;
        System.out.println(twoD[0][1]);

        //можно объявить непосредственно как и одномерный массив
        int twoD2[][] = {
                {1,2,3,4,5},
                {6,7,8,9,10}
        };
        System.out.println(twoD2[1][0]);//выведет элемент второй строки, первого столбца
        //Удобно выводит двумерный массив
        System.out.println(Arrays.deepToString(twoD2));

        /*
        Есть еще так называемые рваные(зубчатые,ломаные) массивы
        Мы можем задавать длину каждого вложенного массива отдельно
        Например:
         */
        int[][] crazyArray = new int[3][]; // память под первое измерение
        // далее резервируем память под второе измерение
        twoD[0] = new int[2];
        twoD[1] = new int[5];
        twoD[2] = new int[4];

        //проверим что массив является ссылочным типом
        int[] intArr = new int[5];
        //Метод Arrays.fill() - наполнение массива одинаковыми данными
        Arrays.fill(intArr,10);
        //Метод Arrays.toString удобно выводит одномерный массив
        System.out.println(Arrays.toString(intArr));
        //Метод Arrays.equals(arr1,arr2) - сравнивает два массива, если содержимое одинаково - вернет true

        //System.arraycopy() - копирует элементы одного массива в другой

    }
}