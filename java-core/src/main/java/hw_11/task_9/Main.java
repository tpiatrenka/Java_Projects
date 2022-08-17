package hw_11.task_9;

import java.util.Set;
import java.util.TreeSet;

//+- класс Student не имплементирует Comparable, а при создании TreeSet не передается компаратор. Этот код работает?..
//Есть TreeSet<Student>. Заполните его списком студентов.
// Если получили исключение, вспомните про интерфейс Comparable или Comparator
public class Main {
    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>();
        Student student1 = new Student("Vasia", 1);
        Student student2 = new Student("Ania", 1);
        Student student3 = new Student("Lea", 3);
        Student student4 = new Student("Maks", 5);
        Student student5 = new Student("Maks", 5);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
//Лишние пустые строчки

    }
}
