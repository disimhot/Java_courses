package lecture4.default_method;

/*
Пример переопределения метода toString()
 */
public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.name = "John";
        worker.age = 25;
        worker.salary = 40000;

        System.out.println(worker);
    }
}

class Worker{
    int salary;
    int age;
    String name;

    /*
    Переопределяем метод toString() из класса Object
     */
    public String toString(){
        return "Это рабочий "+ name + " лет ему " + age +
                " и его зарплата " + salary;
    }

}
