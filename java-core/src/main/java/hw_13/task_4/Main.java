package hw_13.task_4;

import java.util.List;
import java.util.Optional;

//Есть коллекция чисел, найти первое, которое будет больше 22
public class Main {
    public static void main(String[] args) {
        List<Integer> numberList = List.of(21, 2, 23, 24, 25, 6, 7, 22, 8, 9, 22);
        Optional<Integer> first = numberList.stream().filter(x-> x > 22).findFirst();
        System.out.println(first);
    }

}
