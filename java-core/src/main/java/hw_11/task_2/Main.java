package hw_11.task_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//+
//Создайте целочисленный ArrayList. Заполните его 100 элементами,
// добавляя каждый новый элемент в начало списка и выведите на экран.
//Затем удалите из него все четные элементы. И снова выведите на экран
public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            integerList.add(0, i);
        }
        Iterator<Integer> iterator = integerList.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(integerList);
    }
}
