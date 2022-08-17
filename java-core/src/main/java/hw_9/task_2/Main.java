package hw_9.task_2;
//Есть некоторый текст, его нужно записать в файл. Можно использовать одно и то же предложение, запишите его 1000 раз

import java.io.FileOutputStream;
import java.io.IOException;

//+, только сначала надо было сгенерировтаь текст (string.repeat), потом воспользоваться BufferedFileOutputStream
public class Main {
    public static void main(String[] args) {
        String text = "Hello world!";
        try (FileOutputStream fos = new FileOutputStream("src/hw_9/task_2/strings1000.txt")) {
            // перевод строки в байты
            byte[] buffer = text.getBytes();
            for (int i = 0; i < 1000; i++) {
                fos.write(buffer, 0, buffer.length);
            }
            System.out.println("The file has been written");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
