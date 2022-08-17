package hw_13.task_8;

import hw_13.task_3.Phone;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Есть коллекция телефонов, нужно сгруппировать по компании и вывести на экран
public class Main {
    public static void main(String[] args) {
        List<Phone> phones = List.of(
                new Phone("Apple", "6S", 100),
                new Phone("Apple", "11Pro", 200),
                new Phone("Samsung", "Galaxy", 800),
                new Phone("Xiaomi", "Note8", 500),
                new Phone("Cubot", "Power", 80)
        );
        Map<String, List<Phone>> collect = phones.stream().collect(Collectors.groupingBy(Phone::getCompany));
        collect.forEach((k, v) -> {
            System.out.println(k);
            System.out.println(v);
            System.out.println();
        });

    }
}
