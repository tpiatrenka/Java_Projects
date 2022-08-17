package hw_12.task_3;

import java.util.function.BinaryOperator;

//Используя интерфейс BinaryOperator написать лямбда-выражение, которое бы умножало одно целое число на другое
public class Main {
    public static void main(String[] args) {
        BinaryOperator<Integer> multi = (x, y) -> x * y;
        Integer result = multi.apply(2,5);
        System.out.println(result);
    }
}
