package ru.mai.javacourses.lecture3.links;

/*
Этот пример демонстрирует передачу в Java. По ссылке и по значению.

Определение:
Примитивы в Java передаются по значению, объекты по ссылке.

Далее дан исчерпывающий ответ с одного форума:
Грубо говоря программист получает два вида передачи сущности: примитивы передаются по значению (копируется его значение),
и ссылки на объект тоже передаются по значению (копируется значение самой ссылки на тот же самый объект).
Те ссылки две объект один. В методе изменить объект через переданную ссылку возможно,
а вот изменение значения ссылки никакого результата не принесет!
 */

public class TestLinks {
    public static void main(String[] args) {
        //Попробуем измениить значение переменной примитивного типа
        int primitive = 5;
        Links.changePrimitiveValue(primitive);
        System.out.println(primitive);//ЗНАЧЕНИЕ ОСТАЛОСЬ ПРЕЖНИМ и НЕ изменилось.

        //Попробуем изменить состояние объекта, т.е значение поля i в объекте link.
        Links link = new Links();
        link.i = 5;
        Links.changeObjectValues(link);//Всё нормально, передали ссылку, а в методе по ссылке изменили объект
        System.out.println(link.i);

        //Попробуем изменить значение ссылки на объект, передав ее в метод
        Links link2 = new Links();
        link2.i = 7;
        Links.changeObjectLink(link2);// В МЕТОДЕ ССЫЛКА(Копия ссылки) ИЗМЕНИЛАСЬ
        System.out.println(link2.i);//НО ИЗНАЧАЛЬНАЯ ССЫЛКА ОСТАЛАСЬ ПРЕЖНЕЙ

    }
}

class Links{

    int i;


    //Изменить значение примитивного типа
    static void changePrimitiveValue(int i){
        i = 100;
    }

    //изменить состояние объектна по ссылке
    static void changeObjectValues(Links links){
     links.i = 100;
    }

    //изменить значение ссылки объекта
    static void changeObjectLink(Links links){
        links = new Links();
        links.i = 999;
    }
}
