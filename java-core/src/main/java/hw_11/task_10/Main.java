package hw_11.task_10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//+
//Есть неупорядоченный склад с фруктами (допустим это List<Fruits>). У фрукта есть название и кол-во в кг.
//Нужно произвести переучет и выяснить общее кол-во килограмм каждого из фруктов.
//Попробуйте в качестве учетного журнала использовать HashMap или TreeMap
public class Main {
    public static void main(String[] args) {
        List<Fruits> fruits = new ArrayList<Fruits>();
        Fruits fruits1 = new Fruits("Banana", 15);
        Fruits fruits2 = new Fruits("Orange", 32);
        Fruits fruits3 = new Fruits("Kiwi", 13);
        Fruits fruits4 = new Fruits("Banana", 5);
        Fruits fruits5 = new Fruits("Kiwi", 7);

        fruits.add(fruits1);
        fruits.add(fruits2);
        fruits.add(fruits3);
        fruits.add(fruits4);
        fruits.add(fruits5);

        Map<String, Integer> fruitsMap = new HashMap<>();
        for (Fruits fruit : fruits) {
            if (!fruitsMap.containsKey(fruit.getName())) {
                fruitsMap.put(fruit.getName(), fruit.getKg());
            } else {
                Integer a = fruitsMap.get(fruit.getName());
                fruitsMap.put(fruit.getName(), a + fruit.getKg());
            }
        }
        System.out.println(fruitsMap);
    }
}
