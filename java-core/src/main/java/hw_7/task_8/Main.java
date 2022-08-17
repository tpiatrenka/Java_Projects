package hw_7.task_8;

//+
//Есть массив строк, вывести на экран все строки, длина которых больше 5 символов
public class Main {
    public static void main(String[] args) {
        String[] string = {"Volvo", "BMW", "Ford", "Mazda", "Mercedes", "Wolkswagen"};
        for (int i = 0; i < string.length; i++) {
            if (string[i].length() > 5) {
                System.out.println(string[i]);
            }
        }
    }
}
