package hw_13.task_9;

import hw_13.task_3.Phone;

import java.util.List;
import java.util.stream.Collectors;

//Есть коллекция телефонов. Нужно разделить на две части, в одной только айфоны, в другой остальные производители.
public class Main {
    public static void main(String[] args) {
        List<Phone> phones = List.of(
                new Phone("Apple", "6S", 100),
                new Phone("Apple", "11Pro", 200),
                new Phone("Samsung", "Galaxy", 800),
                new Phone("Xiaomi", "Note8", 500),
                new Phone("Cubot", "Power", 80)
        );
        List<Phone> applePhones = phones.stream().filter(phone -> phone.getCompany().equals("Apple")).toList();
        List<Phone> notApplePhones = phones.stream().filter(phone -> !phone.getCompany().equals("Apple")).toList();
        System.out.println(applePhones);
        System.out.println(notApplePhones);
    }
}
