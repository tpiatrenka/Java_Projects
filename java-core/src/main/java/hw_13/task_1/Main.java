package hw_13.task_1;

import java.util.List;
import java.util.stream.Collectors;

//Есть коллекция строк, нужно убрать все элементы, длина которых меньше 5 символов
public class Main {
    public static void main(String[] args) {
        List<String> stringList = List.of("Hello", "BYBYBY", "Weather", "JavaJavajava");
        List<String> filtered = stringList.stream().filter(x -> x.length() > 5)
                .collect(Collectors.toList());
        System.out.println(filtered);
    }


}
