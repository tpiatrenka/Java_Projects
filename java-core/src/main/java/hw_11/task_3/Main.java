package hw_11.task_3;

import java.util.ArrayList;
import java.util.List;

//+
//Есть две коллекции, нужно удалить из первой те, которые есть во второй
public class Main {
    public static void main(String[] args) {
        List<Integer> firstIntegerList = new ArrayList<>();
        firstIntegerList.add(1);
        firstIntegerList.add(2);
        firstIntegerList.add(3);
        firstIntegerList.add(4);
        firstIntegerList.add(5);
        firstIntegerList.add(6);

        List<Integer> secondIntegerList = new ArrayList<>();
        secondIntegerList.add(1);
        secondIntegerList.add(2);
        secondIntegerList.add(3);

        firstIntegerList.removeAll(secondIntegerList);
        System.out.println(firstIntegerList);
//Лишняя пустая строка 
    }
}
