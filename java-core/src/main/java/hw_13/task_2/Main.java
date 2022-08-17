package hw_13.task_2;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//Есть коллекция строк, нужно найти строку с максимальной длинной.
public class Main {
    public static void main(String[] args) {
        List<String> stringList = List.of("Hello", "BYBYBY", "Weather", "JavaJavajava");
        Optional<String> maxLength = stringList.stream().max(Comparator.comparing(String::length));
        System.out.println(maxLength);
    }
}
