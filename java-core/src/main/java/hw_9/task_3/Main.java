package hw_9.task_3;

import java.io.FileInputStream;
import java.io.IOException;

//Прочитать файл из Task_2 и вывести на экран содержимое
//+, но мого пустых ненужных строчек. И тут тоже можно использовать BufferedStream
public class Main {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("src/hw_9/task_2/strings1000.txt")) {
            System.out.printf("File size: %d bytes \n", fin.available());

            int i = -1;
            while ((i = fin.read()) != -1) {

                System.out.print((char) i);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
