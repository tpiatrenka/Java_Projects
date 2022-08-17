package hw_4.task_3;
//Создайте массив, состоящий из объектов класса из 'Task 1'. Найдите кол-во одинаковых объектов в массиве

import hw_4.task_1.Person;

import java.lang.reflect.Array;
import java.util.Set;

//+ Отличный вариант 
public class Main {
    public static void main(String[] args) {
        int sum = 0; //можно перенести ближе к использованию, даже в if и инициализировать единицей
        Person[] personList = new Person[10];
        personList[0] = new Person("Kate",25);
        personList[1] = new Person("Kate",25);
        personList[2] = new Person("Maxi",27);
        personList[3] = new Person("Maxi",27);
        personList[4] = new Person("Anna",30);
        personList[5] = new Person("Olia",23);
        personList[6] = new Person("Phil",28);
        personList[7] = new Person("Mija",23);
        personList[8] = new Person("Anna",30);
        personList[9] = new Person("Anna",30);
        boolean[] excludes = new boolean[10];

        for (int i = 0; i < 10; i++) {
            if (excludes[i]) { continue; }
            sum = 1;
            for (int j = i + 1; j < 10; j++) {
                if (personList[i].equals(personList[j])) {
                    sum += 1;
                    excludes[j] = true;
                }
//Лишняя пустая строка 
            }
            if (sum > 1) {
                System.out.println(personList[i].show() + " is repeated " + sum + " times");
            }
        }
    }


}
