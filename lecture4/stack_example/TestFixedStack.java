package lecture4.stack_example;

/*
Пример динамического стека который автоматически меняет свой размер при заполнении

 */
public class TestFixedStack {
    public static void main(String[] args) {
        DynStack mystack1 = new DynStack(5);
        DynStack mystack2 = new DynStack(8);

        for (int i = 0; i < 12; i++) mystack1.push(i);
        for (int i = 0; i < 20; i++) mystack2.push(i);

        for (int i = 0; i < 12; i++) {
            System.out.println(mystack1.pop());
        }

        for (int i = 0; i < 20; i++) {
            System.out.println(mystack2.pop());
        }
    }
}

class FixedStack implements IntStack{
    private Object stck[];
    private int tos;

    public FixedStack(int size) {
        stck = new Object[size];
        tos = -1;
    }



    public void push(Object item) {
        if(tos == stck.length-1)
            System.out.println("Стек заполнен");
        else
            stck[++tos] = item;
    }

    public Object pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен");
            return 0;
        }else return stck[tos--];
    }
}

interface IntStack{
    void push(Object item);
    Object pop();

}

class DynStack{
    private int stck[];
    private int tos;


    public DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен");
            return 0;
        }else return stck[tos--];
    }
    //При занесении элемента проверяем размер стека
    //Если стек заполнен, увеличиваем массив вдвое
    public void push(int item){
        if(tos == stck.length-1){
            System.out.println("Размер стека увеличен вдвое");
            int temp[] = new int[stck.length * 2];
            for (int i = 0; i < stck.length; i++)temp[i] = stck[i];
            stck = temp;
            stck[++tos] = item;

        }
        else stck[++tos] = item;
    }

}
