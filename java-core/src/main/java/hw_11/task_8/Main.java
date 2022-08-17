package hw_11.task_8;

import java.util.HashSet;
import java.util.Set;

//+
//Есть HashSet магазинов. У магазина есть название и ID. Создать несколько магазинов (через оператор new Shop(..))
//с одинаковым ID и названием и добавить их в ваш Set. Попробуйте разобраться почему они все добавились,
//несмотря на то, что Set обеспечивает уникальность
public class Main {
    public static void main(String[] args) {
        Set<Shop> shopSet = new HashSet<>();
        Shop shop1 = new Shop(1, "Nike");
        Shop shop2 = new Shop(1, "Nike");
        Shop shop3 = new Shop(1, "Nike");

        shopSet.add(shop1);
        shopSet.add(shop2);
        shopSet.add(shop3);
        System.out.println(shopSet);
    }
    //Добавляются все, если не надписывать HashCode() в классе Shop.
    // Оператор new при создании магазина выделяет каждому магазину свое место в памяти
    //Верно
}
