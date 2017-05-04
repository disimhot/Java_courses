package ru.mai.javacourses.lecture3.stack;

/*
Начальная версия стека, который мы рассматривали на занятии
 */
//В этом классе определяется целочисленный стек, в котором
//можно хранить до 10 целочисленных значений
public class Stack {
    private int stck[] = new int[10];
    private int top;
    public int k = 10;

    //инизициализровать вершину стека
    public Stack(){
        top = 0;
    }

    //разместить элемент в стеке
    void push(int item) {
        if(top == 9)
            System.out.println("Стек заполнен");
        else
            stck[top++] = item;
    }

    //извлечь элемент из стека
    int pop(){
        if (top == 0){
            System.out.println("Стек не загружен.");
            return 0;
        }else return stck[top--];
    }

}
