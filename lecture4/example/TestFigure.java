package lecture4.example;

/**
 * Created by nikita on 05.04.16.
 */
abstract class Figure{
    protected double dim1;
    double dim2;

    Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }

    abstract double area();

    abstract void draw();
}

class Rectangle extends Figure{
    Rectangle(double a, double b){
        super(a,b);
    }

    //переопределить метод area() для четырехугольника
    double area(){
        System.out.println("В области четырехугольника");
        return dim1 * dim2;
    }

    void draw(){
        System.out.println("Нарисовали прямоугольник");
    }
}

class Triangle extends Figure{
    Triangle(double a, double b){
        super(a,b);
    }

    double area(){
        System.out.println("В области прямоугольного треугольника");
        return dim1*dim2/2;
    }

    void draw(){
        System.out.println("Нарисовали треугольник");
    }

}

class TestFigure{
    public static void main(String[] args) {
        Figure figure = new Rectangle(2,4);
        Paint.draw(figure);

        Rectangle rectangle = new Rectangle(6,7);
        Paint.draw(rectangle);



    }
}

class Paint{
   static void draw(Figure figure){
        figure.draw();
    }
}
