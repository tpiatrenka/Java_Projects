package hw_9.task_4;

import java.io.*;

//+-
//Создайте класс Employee, Work. У Work есть атрибуты название и минимальный стаж.
//У Employee есть имя, возраст и работа (work).
//Запишите объект Employee в файл, затем восстановите его обратно в объект.
public class Main {
    public static void main(String[] args) {
        String path = "src/hw_9/task_4/employee.txt";
        Employee kris = new Employee("Kris", 29, new Work("Manager", 4));
        writeEmployee(kris, path);
        Employee person = (Employee) readEmployee(path); //класс каст уже делается внутри метода
        System.out.println(person);
    }

    private static void writeEmployee(Employee person, String path) {
        try (FileOutputStream fos = new FileOutputStream(path)) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(person);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Employee readEmployee(String path) {
        try (FileInputStream fis = new FileInputStream(path)) {
            ObjectInputStream ois = new ObjectInputStream(fis); //можно тоже закинуть в трай с ресурами
            Object obj = ois.readObject();
            System.out.println("The object has been read from the file");
            ois.close();//в finally или в трай с ресурсами 
            return (Employee) obj;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}

