package hw_16.task_2;

import java.util.ArrayList;
import java.util.List;

//+-
//Есть магазин игрушек, в который несколько поставщиков (потоков) доставляют товар.
// Вам необходимо доставить в магазин игрушки (например 100 от одного поставщика
// и 50 от другого и затем вывести на экран все игрушки, которые сейчас в магазине
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ToyShop shop = new ToyShop();
        DeliveryThread dt = new DeliveryThread(shop, 100);
        DeliveryThread dt2 = new DeliveryThread(shop, 50);
        dt.start();
        dt2.start();
        dt.join();
        dt2.join();
        System.out.println(shop.list().size());
        System.out.println(shop.list());
        System.out.println("The main thread is finished");
    }
}

class DeliveryThread extends Thread {
    ToyShop shop;
    Integer number;

    DeliveryThread(ToyShop shop, Integer number) {
        this.shop = shop;
        this.number = number;
    }

    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        //можно использовать String.valueOf для преобразования, чтобы в цикле использовать int
        for (Integer i = 1; i <= number; i++) {
            shop.put(new Toy(i.toString()));
        }
    }
}

class ToyShop {
    List<Toy> list = new ArrayList<>();

    public synchronized void put(Toy toy) {
        list.add(toy);
    }

    //тут нет изменений листа - методу не надо быть synchronized 
    public synchronized List<Toy> list() {
        return list;
    }
}

class Toy {
    String name;

    public Toy(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                '}';
    }
}
