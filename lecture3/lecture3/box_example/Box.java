package ru.mai.javacourses.lecture3.box_example;

//Новый тип данных(класс) Box - коробка.
//На лекции мы последовательно улучшали наш класс Box.
/*
    1)Сначала мы создали просто поля класса и могли при создании объекта присвоить значения этим полям напрямую
    2)После мы добавили метод который возвращает нам расчитанное значение объема коробки. Метод - volume()
    3)Затем мы добавляли метод setDims(), который вызывали на нашем объекте и могли задать размеры нашей коробки,
    уже не напрямую как раньше.
    4)Затем мы рассмотрели возможность задания значений коробки, непосредственно при создании объекта. Для этого мы
    использовали конструктор класса Box.
    5)Конструктор как и метод может иметь входные параметры. Мы добавили 3 входных параметра в наш конструктор.
    6)И наконец, мы учли применили принцип Инкапсуляции к нашему классу. Для этого мы использовали модификатор доступа private.
    Мы добавили private к полям нашего класса, тем самым закрыыв доступ к этим полям за пределами класса Box.

    P.S. Ключевое слово this в конструкторе используется для обращения к текущему объекту класса Box.

    Ниже пример уже конечного класса Box. Со всеми наработками.
*/


class Box {
    private double width;
    private double height;
    private double depth;


    Box(double w, double h, double d){
        System.out.println("Конструирование объекта Box");
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    double volume(){
        return width * height * depth;
    }


}



class BoxDemo7{
    public static void main(String[] args) {
        //Создали два объекта класса Box. Т.е две разные коробки.
        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box(3,6,9);

        double vol;

        //Вывести объемы параллепипидов
        vol = mybox1.volume();
        System.out.println(vol);
        vol = mybox2.volume();
        System.out.println(vol);
    }

}

