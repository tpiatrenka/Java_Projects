package hw_9.task_6;

import java.io.*;

//+
//Секретный файл. Скачайте любую картинку и запишите в нее секретное сообщение, не забудьте поставить append flag в значение true.
//Затем это сообщение нужно прочитать из файла и вывести на экран
public class Main {
    public static void main(String[] args) throws IOException {
//       appendToFile("src/hw_9/task_6/file-photo-smiling-dog.jpeg","DOG dog!");
        readFromFile("src/hw_9/task_6/file-photo-smiling-dog.jpeg");

    }

    static void appendToFile(String filePath, String content) throws IOException {
        FileWriter fw = new FileWriter(filePath, true); //обчыно его используют для текста, но так тоже можно
        fw.write(content);
    }

    static void readFromFile(String filePath) throws IOException {
        byte[] bytes = new byte[8];
        File file = new File(filePath);
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        randomAccessFile.seek(file.length() - 8);
        randomAccessFile.read(bytes, 0, 8);
        String str = new String(bytes);
        System.out.println(str);
    }
}
