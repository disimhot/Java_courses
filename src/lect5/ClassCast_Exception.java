package lect5;

//Нельзя выполнять явное преобразование типов произвольным образом
public class ClassCast_Exception {
    public static void main(String[] args) {
    Object test = new Character('*'); //Создали ссылку на объект класса Character
    try {
        System.out.println((Byte)test); //Преобразовываем ссылку к типу Byte
    }catch (ClassCastException e){
        System.out.println("ClassCast Exception");
    }
    }
}
