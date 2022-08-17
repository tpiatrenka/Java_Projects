package hw_11.task_4;

import java.util.ArrayList;
import java.util.List;

//+
//Есть две коллекции, нужно оставить в первой только те, которые есть во второй
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
        secondIntegerList.add(7);

        firstIntegerList.retainAll(secondIntegerList);
        System.out.println(firstIntegerList);
    }
}
