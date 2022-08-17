package hw_11.task_5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//+-
//Есть ArrayList и LinkedList на 100К одинаковых элементов.
//Нужно написать бенчмарк, который бы показал скорость удаления из СЕРЕДИНЫ у двух этих листов
//Удалить нужно все элементы
public class Main {
    public static void main(String[] args) {
        List<Integer> arrayNumbers = new ArrayList<>();
        //Количество элементов лучше закинуть в переменную - при их изменени нужно будет поменять только в одном месте, сейчас - в 4ёх
        for (Integer i = 0; i < 100_000; i++) {
            arrayNumbers.add(i);
        }

        //delete from the middle ArrayList
        long start = System.currentTimeMillis();
        for (Integer i = 0; i < 100_000; i++) {
            arrayNumbers.remove(arrayNumbers.size() / 2);
        }
        long end = System.currentTimeMillis();
        System.out.println("ArrayList time = " + (end - start));

        List<Integer> linkedListNumbers = new LinkedList<>();
        for (Integer i = 0; i < 100_000; i++) {
            linkedListNumbers.add(i);
        }
        start = System.currentTimeMillis();
        //А вот и проблемка с отсутствием переменной - количество итераций меньше, чем в других циклах
        for (Integer i = 0; i < 100_00; i++) {
            linkedListNumbers.remove(linkedListNumbers.size() / 2);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList time = " + (end - start));
    }
}
