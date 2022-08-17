package hw_16.task_1;

//+
//Создать класс, который в цикле выводит на экран числа от 0-20 и в каждой итерации цикла засыпает на 1 секунду,
//запустить его в отдельном потоке. Поток main должен дождаться окончания работы дочернего потока
//и затем вывести на экран сообщение о том, что главный поток завершен
public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.join();
        System.out.println("The main thread is finished");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        for (int i = 0; i < 21; i++) {
            System.out.println(i);
            try {
                thread.sleep(1000);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
