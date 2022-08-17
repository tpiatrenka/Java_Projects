package hw_13.task_3;

import java.util.List;
import java.util.stream.Collectors;

//Есть коллекция телефонов. Необходимо получить из нее коллекцию производителей (производитель - это строка) и оставить только те, которые входят в список:
// Apple, Samsung, Xiaomi
public class Main {
    public static void main(String[] args) {
        List<String> allowedCompanies = List.of("Apple", "Samsung", "Xiaomi");
        List<Phone> phoneList = List.of(
                new Phone("Apple", "6S", 100),
                new Phone("Samsung", "Galaxy", 100),
                new Phone("Xiaomi", "Note8", 100),
                new Phone("Cubot", "Power", 100)
        );
        List<String> mapedPhones = phoneList.stream().map(Phone::getCompany)
                .filter(allowedCompanies::contains)
                .collect(Collectors.toList());
        System.out.println(mapedPhones);
    }
}
