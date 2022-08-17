package hw_16.task_4;

import java.io.*;
import java.util.Scanner;

//+-
//Написать программу, которая получает аргументом программы пути к файлам.
//Программа должна посчитать кол-во слов в каждом файле по отдельности,
//затем общее кол-во файлов и вывести на экран.
//На каждый файл используйте отдельный поток для вычислений.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < args.length; i++) {
            File file = new File(args[i]);
            ReaderThread rt = new ReaderThread(file);
            rt.start(); //каждый из потоков работает последовательно - добавь в run вывод текущего потока. Попробуй переписать с использованием executorService
            rt.join();
            System.out.println(args[i] + " " + rt.numberOfWords);
        }
        System.out.println("The number of paths is " + args.length);

        System.out.println("The main thread is finished");
    }
}

class ReaderThread extends Thread {
    Integer numberOfWords = 0;
    File file;

    ReaderThread(File file) {
        this.file = file;
    }

    @Override
    public void run() {
        try (Scanner sc = new Scanner(new FileInputStream(file))) {
            while (sc.hasNext()) {
                sc.next();
                numberOfWords++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
