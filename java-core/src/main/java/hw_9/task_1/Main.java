package hw_9.task_1;
//Есть массив чисел, заполнить его можете любыми цифрами. Нужно записать его в файл

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

//+-
public class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        try {
            FileOutputStream fos = new FileOutputStream("src/hw_9/task_1/numbers.txt");
            for (int i = 0; i < numbers.length; i++)
                fos.write(numbers[i]);
            fos.close(); //close делаем в файнали с проверкой на fos != null или используем трай с ресурсами
        } catch (IOException e) {
            System.out.println("Error - " + e.toString());
        }
    }
}
