package hw_7.task_1;

//+
//Игра в слова. Есть строка “engineering”. Нужно выделить подстроку так, чтобы получилось два слова “engine” и “ring”.
public class Main {
    public static void main(String[] args) {
        String string = "engineering";
        System.out.println(string.substring(0, 5) + " " + string.substring(7));
    }
}
