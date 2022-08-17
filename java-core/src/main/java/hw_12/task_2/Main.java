package hw_12.task_2;

import java.util.function.Function;

//Написать функцию перевода числа в строку с добавлением денежной единицы. Например, 5 -> 5 рублей.
public class Main {
    public static void main(String[] args) {
        Function<Integer, String> moneyFormatter = value -> {
            if (value % 10 == 1 && value != 11) {
                return value + " рубль";
            } else if (value % 10 == 2 && value != 12) {
                return value + " рубля";
            } else if (value % 10 == 3 && value != 13) {
                return value + " рубля";
            } else if (value % 10 == 4 && value != 14) {
                return value + " рубля";
            } else {
                return value + " рублей";
            }
        };
        System.out.println(moneyFormatter.apply(0));
        System.out.println(moneyFormatter.apply(1));
        System.out.println(moneyFormatter.apply(4));
        System.out.println(moneyFormatter.apply(11));
        System.out.println(moneyFormatter.apply(14));
        System.out.println(moneyFormatter.apply(22));
        System.out.println(moneyFormatter.apply(24));
    }
}
