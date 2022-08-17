package hw_9.task_5;
//Продолжение Task_4. А теперь поменяйте любое приватное поле Work/Employee на паблик.
//Попробуйте восстановить файл из Task 4 в объект.
//Попробуйте найти решение в интернете

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String path = "src/hw_9/task_4/employee.txt";//
        Employee kris = new Employee("Kris", 29, new Work("Manager", 4));
        //writeEmployee(kris, path);
        Employee person = (Employee) readEmployee(path);
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
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            System.out.println("The object has been read from the file");
            ois.close();
            return (Employee) obj;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
