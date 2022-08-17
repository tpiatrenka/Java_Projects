package hw_8.task_3;

import java.util.InputMismatchException;
import java.util.Scanner;

//+
//Попросите пользователя ввести число размера будущего массива, но не больше размера Y (задайте сами).
//Если пользователь ввел число больше Y или отрицательное, то выбросьте собственное исключение и
//попросите пользователя ввести число заново.
public class Main {
    public static void main(String[] args) {
        int y = 15; //да, в задании он назван y, но в коде можно задать более понятное имя как max, напрмер
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Введи размер массива");
                int arraySize = scanner.nextInt(); //можно добавить обработку исключения, если пользователь ввел не число
                if (arraySize > y || arraySize < 0) {
                    throw new ArraySizeLimitException();
                }
                Integer[] array = new Integer[arraySize];
                break;
            } catch (ArraySizeLimitException e) {
                System.out.println("Неправильный размер массива"); //тут можно в сообщении добавить подсказку, в каких границах должно быть число. или в сообщение при вводе. Так более юзер френдли
            }
        }
    }
}
