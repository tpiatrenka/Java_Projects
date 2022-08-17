package hw_11.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//+
//Вход на вечеринку только по списку.
//Есть список имен (коллекция). Пользователь вводит с консоли свое имя, а программа проверяет его наличие в списке,
//после чего говорит может он пройти или нет
public class Main {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("Egorka");
        nameList.add("Vasia");
        nameList.add("Mia");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи имя");
        String scannerName = scanner.nextLine();
        boolean present = false;
        //Можно использовать list.contains() 
        for (String name : nameList) {
            if (scannerName.equals(name)) {
                present = true;
                break;
            }
        }
        String result = present ? "Можешь пройти" : "Не можешь пройти"; //когда переменная объявляется и сразу один раз используется один раз, ее можно не заводить
        System.out.println(result);
    }
}
