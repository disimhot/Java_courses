package lecture4.box_example;

/**
 * Created by nikita on 05.04.16.
 */
public class Box {
    double width;
    double height;
    double depth;

    //сконструировать клон объекта
    Box(Box ob){ // передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //конструктор, применяемый при указании всех размеров
    public Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;

    }

    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }

    //Конструктор применяемый при создании куба
    Box(double len){
        width = height = depth = len;
    }

    //рассчитать и возвратить объекм
    double volume(){
        return width * height * depth;
    }
}

class BoxWeight extends Box{
    double weight;

    //конструктор BoxWeight
    BoxWeight(double w, double h, double d, double m){
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
    //сконструировать клон объекта
    BoxWeight(BoxWeight ob){
        super(ob);
        weight = ob.weight;
    }
    //Конструктор по умолчанию
    BoxWeight(){
        super();
        weight = -1;
    }

    //Конструктор применяемый при создании куба
    BoxWeight(double len, double m){
        super(len);
        weight = m;
    }
}

class Shipment extends BoxWeight{
    double cost;

    public Shipment(double w, double h, double d, double m, double cost) {
        super(w, h, d, m);
        this.cost = cost;
    }

}

class TestBox{
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(3,4,5,0.32,5);
        Shipment shipment2 = new Shipment(4,55,53,0.24,3);
        double vol;

        vol = shipment1.volume();
        System.out.println("Объем равен shipment1 = " + vol);
        System.out.println("Вес равен = " + shipment1.weight);





    }
}