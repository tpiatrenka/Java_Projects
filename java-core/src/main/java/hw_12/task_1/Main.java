package hw_12.task_1;

import java.util.ArrayList;
import java.util.List;

//Есть товар, который поступает на склад магазина(пускай это будет коллекция).
//Вам необходимо указать дату и время, в которое товар поступил (например при добавлении его в коллекцию, т.е. склад)
public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("2022-07-11 22:11:00"));
        productList.add(new Product("2022-07-11 22:13:00"));
    }
}
