package hw_13.task_7;

import hw_13.task_3.Phone;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//Есть коллекция телефонов. Найти телефон с наименьшей ценой
public class Main {
    public static void main(String[] args) {
        List<Phone> phones = List.of(
                new Phone("Apple", "6S", 100),
                new Phone("Samsung", "Galaxy", 800),
                new Phone("Xiaomi", "Note8", 500),
                new Phone("Cubot", "Power", 80)
        );
        Optional<Phone> cheapest = phones.stream().min(Comparator.comparing(Phone::getPrice));
        System.out.println(cheapest);
    }
}
