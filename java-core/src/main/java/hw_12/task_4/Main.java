package hw_12.task_4;
//Создать класс User, сделать конструктор с 1 параметром, например, имя.
//Создать функциональный интерфейс, с методом, который бы создавал юзера. Написать лямбда-выражение и создать юзера
public class Main {
    public static void main(String[] args) {
        FuncUser funcUser = name -> new User(name);
        User niki = funcUser.createUser("Niki");
        System.out.println(niki);
    }
}
