package hw_11.task_7;

import java.util.TreeSet;

//+
// Есть TreeSet чисел, нужно отсортировать его в обратном порядке
public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(4);
        treeSet.add(3);
        treeSet.add(6);
        treeSet.add(5);
        System.out.println(treeSet.descendingSet());
//Лишняя пустая строка 
    }
}
