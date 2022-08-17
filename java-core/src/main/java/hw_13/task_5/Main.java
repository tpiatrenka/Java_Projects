package hw_13.task_5;

import java.util.List;

//Есть коллекция чисел, найти произведение первых 5ти элементов.
public class Main {
    public static void main(String[] args) {
        List<Integer> numberList = List.of(2, 2, 2, 2, 2, 6, 7, 22, 8, 9, 22);
        Integer multi = numberList.stream()
                .limit(5)
                .reduce(1, (x, y) -> x * y);
        System.out.println(multi);
    }
}
