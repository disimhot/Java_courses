package ru.mai.javacourses.lecture2;

/*
Циклы
Сначала рассмотрим цикл while
 */
public class Sample3 {

    public static void main(String[] args) {
        int n = 10;
        //Выведет 10 итераций цикла
        while(n>0){
            System.out.println("итерация № " + n);
            n--;//декремент, уменьшаем переменную n на единицу в каждой итерации
        }

        //Пример бесконечного цикла
//        char infinity = 8734;
//        while (true){
//            System.out.println(infinity);
//        }

        int i = 100;
        int j = 200;
        //вычисляется среднее значение переменных i j
        while (++i < --j);

        /*
        Далее рассмотрим цикл do-while
         Данный цикл выполняется всегда хотя бы один раз.
         */
        n = 10;
        do {
            System.out.println("такт " + n);
            n--;
        }while (n > 0);

        //можно упростить цикл, добавив переменную n непосредственно в блок условия, вот так: while(--n > 0);

        /*
        Далее рассмотрим цикл for
         */

        for (n = 10; n > 0; n--){
            System.out.println("такт " + n);
        }
        //Пример использования цикла for : перебор
        //всех ASCII - символов нижнего регистра
        //Уберите комментарий в следующей строке, чтобы вызвать функцию
        //throughLowCases();

        //Любые из трех выражений цикла могут отсутствовать
        //К примеру бесконечный цикл for будет выглядеть следующим образом
        //for(;;){}


        //Комбинация клавиш CTR-J покажет все сокращения в Idea. Например сокращение fori для быстрого создания цикла for.
        //далее цикл for в стиле for-each
        //В отличие от обычного цикла for, элементы в цикле for в стиле for-each "только для чтения"
        int nums[] = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for (i = 0; i < 10; i++) {
            sum+= nums[i];
        }
        System.out.println("Сумма sum по обычному циклу for = "+sum );
        //если перебор в строгой последовательности можем использовать for-each(для каждого элемента)
        sum = 0;
        //for-each - упрощает синтаксис, исключает ошибку выхода за пределы массива
        for (int x : nums) {
            sum += x;
        }
        System.out.println("Сумма sum в стиле for-each = "+ sum);
        System.out.println("--------------");
        //Далее приведена функция, которая перебирает элементы двумерного массива, циклом for-each
        //Раскомментируйте следующую строку чтобы вызвать функцию
        //twoDArrayForEach();

    }

    static void throughLowCases(){
        for (char c = 0; c < 128; c++){
            if(Character.isLowerCase(c))
                System.out.println("значение: " + (int)c + " символ: " + c);
        }
    }

    static void twoDArrayForEach(){
        int sum = 0;
        int nums[][] = new int[3][5];

        //присвоить значения элементам массива nums
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                nums[i][j] = (i+1)*(j+1);
            }
        }

        //Используем for в стиле for-each для вывода и суммирования значений

        for (int x[] : nums) {
            for (int y : x) {
                System.out.println("Значение равно: " + y);
                sum += y;
            }
        }
        System.out.println("Сумма: " + sum);

    }


}
