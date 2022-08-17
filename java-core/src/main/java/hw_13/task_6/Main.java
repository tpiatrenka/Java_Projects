package hw_13.task_6;

import hw_13.task_3.Phone;

import java.util.List;
import java.util.stream.Collectors;

//Есть коллекция телефонов, нужно убрать все повторяющиеся
public class Main {
    public static void main(String[] args) {
        List<Phone> phoneList = List.of(
                new Phone("Apple", "6S", 100),
                new Phone("Samsung", "Galaxy", 100),
                new Phone("Xiaomi", "Note8", 100),
                new Phone("Cubot", "Power", 100),
                new Phone("Cubot", "Power", 100)
        );
        List<Phone> uniquePhones = phoneList.stream().distinct().collect(Collectors.toList());
        System.out.println(uniquePhones);
    }
}
